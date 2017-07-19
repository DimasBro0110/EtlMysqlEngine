package com.dimas.brosalin.test.writer;

import com.dimas.brosalin.test.dao.AirlineCodesDAO;
import com.dimas.brosalin.test.model.AirlineCodes;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by DmitriyBrosalin on 18/07/2017.
 */
public class CustomAirlineCodesWriter implements ItemWriter<AirlineCodes> {

    private AirlineCodesDAO airlineCodesDAO;
    private String headerFile;

    public void write(List<? extends AirlineCodes> list) throws Exception {
        String[] partHeader = headerFile.split(",");
        list.forEach(obj -> {
            if(!obj.getAirLineCode().equals(partHeader[0]) &&
                    !obj.getAirLineCode().equals(partHeader[1])){
                airlineCodesDAO.save(obj);
            }
        });

    }

    public void setAirlineCodesDAO(AirlineCodesDAO airlineCodesDAO) {
        this.airlineCodesDAO = airlineCodesDAO;
    }

    public void setHeaderFile(String headerFile) {
        this.headerFile = headerFile;
    }
}