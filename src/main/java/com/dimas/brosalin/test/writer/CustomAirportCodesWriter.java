package com.dimas.brosalin.test.writer;

import com.dimas.brosalin.test.dao.AirportCodesDAO;
import com.dimas.brosalin.test.model.AirportCodes;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by DmitriyBrosalin on 19/07/2017.
 */
public class CustomAirportCodesWriter implements ItemWriter<AirportCodes> {

    private AirportCodesDAO airportCodesDAO;
    private String headerFile;

    @Override
    public void write(List<? extends AirportCodes> list) throws Exception {
        String[] partHeader = headerFile.split(",");
        list.forEach(obj -> {
            if(!obj.getAirPortCode().equals(partHeader[0]) &&
                    !obj.getAirPortName().equals(partHeader[1])){
                airportCodesDAO.save(obj);
            }
        });
    }

    public void setAirportCodesDAO(AirportCodesDAO airportCodesDAO) {
        this.airportCodesDAO = airportCodesDAO;
    }

    public void setHeaderFile(String headerFile) {
        this.headerFile = headerFile;
    }
}
