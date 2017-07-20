package com.dimas.brosalin.production.writer;

import com.dimas.brosalin.production.model.FactCaseProductRequest;
import org.springframework.batch.item.ItemWriter;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by dmitriybrosalin on 21.07.17.
 */
public class FactCaseProductRequestWriter extends HibernateDaoSupport implements ItemWriter<FactCaseProductRequest>{

    @Override
    public void write(List<? extends FactCaseProductRequest> list) throws Exception {

    }

}
