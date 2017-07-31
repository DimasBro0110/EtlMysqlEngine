package com.dimas.brosalin.production.partitioner;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by DmitriyBrosalin on 25/07/2017.
 */
public class FlatFilePartitioner implements Partitioner {

    private String pathToFile;

    @Override
    public Map<String, ExecutionContext> partition(int i) {

        Map<String, ExecutionContext> partitionMap = new HashMap<>();
        File file = new File(pathToFile);
        int sizeOfPieces = 64 * 1024 * 1024; // 64 mb each block
        byte[] bufferChunk = new byte[sizeOfPieces];
        int chunkCounter = 1;

        try(FileInputStream fis = new FileInputStream(file)){

            BufferedInputStream bis = new BufferedInputStream(fis);
            int bytesProcessed = 0;
            while ((bytesProcessed = bis.read(bufferChunk)) > 0){
                String partFileName = ("/Users/DmitriyBrosalin/TestFiles/work_data/temp_dir/" + "chunk-" + chunkCounter);
                File newChankFile = new File(partFileName);

                try(FileOutputStream out = new FileOutputStream(newChankFile)){
                    out.write(bufferChunk, 0, bytesProcessed);
                }

            }

            File chunksDir = new File("/Users/DmitriyBrosalin/TestFiles/work_data/temp_dir/");
            if(chunksDir.isDirectory()){
                File[] files = chunksDir.listFiles();
                assert files != null;
                for(File f : files){
                    ExecutionContext executionContext = new ExecutionContext();
                    executionContext.put("fileResource", f.toURI().toString());
                    partitionMap.put(f.getName(), executionContext);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return partitionMap;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }
}
