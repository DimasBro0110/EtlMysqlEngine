package com.dimas.brosalin.production.writer;

import com.dimas.brosalin.production.model.FactDeals;
import org.springframework.batch.item.ItemWriter;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by dmitriybrosalin on 21.07.17.
 */
public class FactDealsWriter extends HibernateDaoSupport implements ItemWriter<FactDeals> {

    @Override
    public void write(List<? extends FactDeals> list) throws Exception {

    }

}
