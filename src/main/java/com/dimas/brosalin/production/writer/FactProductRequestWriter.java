package com.dimas.brosalin.production.writer;

import com.dimas.brosalin.production.model.FactProductRequest;
import org.springframework.batch.item.ItemWriter;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by dmitriybrosalin on 21.07.17.
 */
public class FactProductRequestWriter extends HibernateDaoSupport implements ItemWriter<FactProductRequest> {

    @Override
    public void write(List<? extends FactProductRequest> list) throws Exception {


    }

}
