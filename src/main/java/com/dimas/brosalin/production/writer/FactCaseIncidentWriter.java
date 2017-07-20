package com.dimas.brosalin.production.writer;

import com.dimas.brosalin.production.model.FactCaseIncident;
import org.springframework.batch.item.ItemWriter;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by dmitriybrosalin on 21.07.17.
 */
public class FactCaseIncidentWriter extends HibernateDaoSupport implements ItemWriter<FactCaseIncident> {

    @Override
    public void write(List<? extends FactCaseIncident> list) throws Exception {

    }

}
