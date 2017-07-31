package com.dimas.brosalin.production.partitioner;

/**
 * Created by DmitriyBrosalin on 27/07/2017.
 */

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PartitionerByLines implements Partitioner {

    private String tempDir;
    private String pathToFile;
    private int batchSize;
    private static Logger LOGGER = Logger.getLogger(PartitionerByLines.class.getName());

    private long getAmountOfLines(File file) throws IOException {

        return Files.lines(Paths.get(file.toURI()), Charset.forName("cp1251")).count();
    }

    private void cleanDirecory(){
        File chunksDir = new File(this.tempDir);
        if(chunksDir.isDirectory()){
            LOGGER.log(Level.INFO, "Current directory has files");
            File[] chunkFiles = chunksDir.listFiles();
            if(chunkFiles.length > 0){
                LOGGER.log(Level.INFO, "Started cleaning directory");
                long startCleaninig = System.currentTimeMillis();
                Arrays.stream(chunkFiles).forEach(File::delete);
                long stopCleaninig = System.currentTimeMillis();
                LOGGER.log(Level.INFO,
                        "Directory cleaned, time elapsed: " + ((stopCleaninig - startCleaninig) / 1000.0) +
                                ", sec");
            }else {
                LOGGER.log(Level.INFO, "Directory is empty");
            }
        }
    }

    @Override
    public Map<String, ExecutionContext> partition(int p) {
        Map<String, ExecutionContext> partitionMap = new HashMap<>();
        this.cleanDirecory();
        File inputFile = new File(pathToFile);
        LOGGER.log(Level.INFO,"Counting amount of lines in file: " + pathToFile);
        long linesAmnt = 0;
        try {
            linesAmnt = getAmountOfLines(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOGGER.log(Level.INFO, "Amount of lines calculated: " + linesAmnt);
        long remain = linesAmnt % batchSize;
        long amountBatches = linesAmnt / batchSize;
        List<Long> arrayOfBatches = new ArrayList<>();

        for(int i=0; i<amountBatches; i++){
            arrayOfBatches.add((long) batchSize);
        }
        arrayOfBatches.add(remain);

        String fileNameattern = this.tempDir + "/chunk-";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))){

            String line = "";
            int counter = 0;
            int index = 0;
            List<String> arrayList = new LinkedList<>();


            while((line = bufferedReader.readLine()) != null) {

                if(counter == arrayOfBatches.get(index)){
                    String file = fileNameattern + index;
                    LOGGER.log(Level.INFO ,"Writing file: " + file);
                    long start = System.currentTimeMillis();
                    Files.write(Paths.get(file), (Iterable<String>) arrayList.stream()::iterator);
                    long stop = System.currentTimeMillis();
                    LOGGER.log(Level.INFO,"File written : " + file);
                    LOGGER.log(Level.INFO,"Time elapsed : " + ((stop - start) / 1000.0) + ", sec" );
                    arrayList.clear();
                    counter = 0;
                    index += 1;
                }else{
                    arrayList.add(line);
                    counter += 1;
                }

            }

            File chunksDir = new File(this.tempDir);
            if(chunksDir.isDirectory()){
                File[] files = chunksDir.listFiles();
                assert files != null;
                for(File file: files){
                    ExecutionContext executionContext = new ExecutionContext();
                    executionContext.put("fileResource", file.toURI().toString());
                    executionContext.put("threadName", file.toString() + "-processor");
                    partitionMap.put(file.getName(), executionContext);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return partitionMap;
    }

    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    public void setTempDir(String tempDir){
        this.tempDir = tempDir;
    }

    public void setPathToFile(String pathToFile){
        this.pathToFile = pathToFile;
    }
}

