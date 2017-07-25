package com.dimas.brosalin.production.writer;

import com.dimas.brosalin.production.model.DimCampaign;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.batch.item.ItemWriter;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by dmitriybrosalin on 22.07.17.
 */
public class DimCampaignWriter implements ItemWriter<DimCampaign> {

    private SessionFactory sessionFactory;
    private static Logger LOGGER = Logger.getLogger(DimCampaignWriter.class.getName());

    @Override
    public void write(List<? extends DimCampaign> list) throws Exception {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        list.forEach(session::save);
        session.flush();
        session.clear();
        transaction.commit();
        session.close();
    //    LOGGER.log(Level.INFO, "[ BATCH WITH SIZE OF " + list.size() + " SENT TO TABLE DimCampaignWriter]");
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
