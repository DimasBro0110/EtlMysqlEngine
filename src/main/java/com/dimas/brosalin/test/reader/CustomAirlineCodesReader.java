package com.dimas.brosalin.test.reader;

import com.dimas.brosalin.test.model.AirlineCodes;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.io.BufferedReader;

/**
 * Created by DmitriyBrosalin on 18/07/2017.
 */
public class CustomAirlineCodesReader implements ItemReader<AirlineCodes> {

    private BufferedReader bufferedReader;
    private String lineSeparator;
    private AirlineCodes airlineCodes;

    public AirlineCodes read() throws Exception, UnexpectedInputException,
            ParseException, NonTransientResourceException {
        assert bufferedReader != null;
        String wholeLine = bufferedReader.readLine();
        if(wholeLine != null) {
            String[] partsOfLine = wholeLine.split(lineSeparator);
            airlineCodes.setAirLineCode(partsOfLine[0]);
            airlineCodes.setAirLineName(partsOfLine[1]);
            return airlineCodes;
        }else {
            bufferedReader.close();
            return null;
        }
    }

    public void setBufferedReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public void setLineSeparator(String lineSeparator) {
        this.lineSeparator = lineSeparator;
    }

    public AirlineCodes getAirlineCodes() {
        return airlineCodes;
    }

    public void setAirlineCodes(AirlineCodes airlineCodes) {
        this.airlineCodes = airlineCodes;
    }
}
