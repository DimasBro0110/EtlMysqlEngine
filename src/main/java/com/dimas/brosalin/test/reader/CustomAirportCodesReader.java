package com.dimas.brosalin.test.reader;

import com.dimas.brosalin.test.model.AirportCodes;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.io.BufferedReader;

/**
 * Created by DmitriyBrosalin on 19/07/2017.
 */
public class CustomAirportCodesReader implements ItemReader<AirportCodes> {

    private BufferedReader bufferedReader;
    private String lineSeparator;
    private AirportCodes airportCodes;

    @Override
    public AirportCodes read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        assert bufferedReader != null;
        bufferedReader.readLine(); // get rid off header
        String currentLine = bufferedReader.readLine();
        if(currentLine != null){
            String[] partOfCurrentLine = currentLine.split(lineSeparator);
            airportCodes.setAirPortCode(partOfCurrentLine[0]);
            airportCodes.setAirPortName(partOfCurrentLine[1]);
            return airportCodes;
        }else{
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

    public void setAirportCodes(AirportCodes airportCodes) {
        this.airportCodes = airportCodes;
    }
}
