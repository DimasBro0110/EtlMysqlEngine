package com.dimas.brosalin.production.writer;

import com.dimas.brosalin.production.model.DimPersonalCreditRequest;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by DmitriyBrosalin on 20/07/2017.
 */
public class DimPersonalCreditRequestWriter implements ItemWriter<DimPersonalCreditRequest> {

    @Override
    public void write(List<? extends DimPersonalCreditRequest> list) throws Exception {

        System.out.println("------------------");
        list.forEach(obj -> {
            System.out.println(obj.getPersonalCustomerKey());
            System.out.println(obj.getPersonalEmployerIndustryType());
        });
        System.out.println("------------------");

    }

}
