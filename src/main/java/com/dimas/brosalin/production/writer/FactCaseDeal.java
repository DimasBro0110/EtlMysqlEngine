package com.dimas.brosalin.production.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by dmitriybrosalin on 21.07.17.
 */
public class FactCaseDeal extends HibernateDaoSupport implements ItemWriter<FactCaseDeal> {

    @Override
    public void write(List<? extends FactCaseDeal> list) throws Exception {

    }

}
