package com.dimas.brosalin.production.writer;

import com.dimas.brosalin.production.model.FactDLCards;
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
public class FactDLCardsWriter implements ItemWriter<FactDLCards> {

    private SessionFactory sessionFactory;
    private String threadName;
    private static Logger LOGGER = Logger.getLogger(FactDLCardsWriter.class.getName());

    @Override
    public void write(List<? extends FactDLCards> list) throws Exception {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        list.forEach(session::save);
        session.flush();
        session.clear();
        transaction.commit();
        session.close();
        LOGGER.log(Level.INFO, threadName + " " +
                "[ BATCH WITH SIZE OF " + list.size() + " SENT TO TABLE FactDLCards]");
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
}
