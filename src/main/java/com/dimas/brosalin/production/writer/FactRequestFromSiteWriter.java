package com.dimas.brosalin.production.writer;

import com.dimas.brosalin.production.model.FactRequestFromSite;
import org.springframework.batch.item.ItemWriter;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by dmitriybrosalin on 21.07.17.
 */
public class FactRequestFromSiteWriter extends HibernateDaoSupport
        implements ItemWriter<FactRequestFromSite>{

    @Override
    public void write(List<? extends FactRequestFromSite> list) throws Exception {

    }

}
