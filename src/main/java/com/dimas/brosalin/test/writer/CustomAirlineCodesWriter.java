package com.dimas.brosalin.test.writer;

import com.dimas.brosalin.test.model.AirlineCodes;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by DmitriyBrosalin on 18/07/2017.
 */
public class CustomAirlineCodesWriter implements ItemWriter<AirlineCodes> {

    public void write(List<? extends AirlineCodes> list) throws Exception {
        System.out.println("------------------");
        list.forEach(obj -> {
            System.out.println(obj.getAirLineCode());
            System.out.println(obj.getAirLineName());
        });
        System.out.println("------------------");
    }

}