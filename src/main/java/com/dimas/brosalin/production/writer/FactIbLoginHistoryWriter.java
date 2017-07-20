package com.dimas.brosalin.production.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by dmitriybrosalin on 21.07.17.
 */
public class FactIbLoginHistoryWriter extends HibernateDaoSupport implements ItemWriter<FactIbLoginHistoryWriter> {

    @Override
    public void write(List<? extends FactIbLoginHistoryWriter> list) throws Exception {

    }

}
