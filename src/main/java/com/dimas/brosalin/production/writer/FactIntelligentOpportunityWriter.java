package com.dimas.brosalin.production.writer;

import com.dimas.brosalin.production.model.FactIntelligentOpportunity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.batch.item.ItemWriter;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by DmitriyBrosalin on 24/07/2017.
 */
public class FactIntelligentOpportunityWriter implements ItemWriter<FactIntelligentOpportunity> {

    private SessionFactory sessionFactory;
    private String threadName;
    private static Logger LOGGER = Logger.getLogger(FactIntelligentOpportunityWriter.class.getName());

    @Override
    public void write(List<? extends FactIntelligentOpportunity> list) throws Exception {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        list.forEach(session::save);
        session.flush();
        session.clear();
        transaction.commit();
        session.close();
        LOGGER.log(Level.INFO, threadName + " " + "BATCH WITH SIZE OF " + list.size() + " SENT TO TABLE FactIntelligentOpportunityWriter");
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
}
