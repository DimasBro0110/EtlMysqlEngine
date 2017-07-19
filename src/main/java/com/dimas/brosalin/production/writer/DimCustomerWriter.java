package com.dimas.brosalin.production.writer;

import com.dimas.brosalin.production.model.DimCustomer;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by DmitriyBrosalin on 19/07/2017.
 */
public class DimCustomerWriter implements ItemWriter<DimCustomer> {

    //place to inject DAO

    @Override
    public void write(List<? extends DimCustomer> list) throws Exception {
        System.out.println("------------------");
        list.forEach(obj -> {
            System.out.println(obj.getCustomerKey());
            System.out.println(obj.getCustomerBirthDate());
        });
        System.out.println("------------------");
    }
}
