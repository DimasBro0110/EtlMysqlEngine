package com.dimas.brosalin.test.writer;

import com.dimas.brosalin.test.model.AirportCodes;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by DmitriyBrosalin on 19/07/2017.
 */
public class CustomAirportCodesWriter implements ItemWriter<AirportCodes> {
    @Override
    public void write(List<? extends AirportCodes> list) throws Exception {
        System.out.println("------------------");
        list.forEach(obj -> {
            System.out.println(obj.getAirPortCode());
            System.out.println(obj.getAirPortName());
        });
        System.out.println("------------------");
    }
}
