package com.dimas.brosalin.production.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by DmitriyBrosalin on 20/07/2017.
 */
public class DimProductSubgroup extends HibernateDaoSupport implements ItemWriter<DimProductSubgroup>{

    @Override
    public void write(List<? extends DimProductSubgroup> list) throws Exception {

    }

}
