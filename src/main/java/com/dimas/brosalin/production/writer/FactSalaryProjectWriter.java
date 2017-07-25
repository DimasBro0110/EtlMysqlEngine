package com.dimas.brosalin.production.writer;

import com.dimas.brosalin.production.model.FactSalaryProject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.batch.item.ItemWriter;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by dmitriybrosalin on 23.07.17.
 */
public class FactSalaryProjectWriter implements ItemWriter<FactSalaryProject> {

    private SessionFactory sessionFactory;
    private static Logger LOGGER = Logger.getLogger(FactSalaryProjectWriter.class.getName());

    @Override
    public void write(List<? extends FactSalaryProject> list) throws Exception {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        list.forEach(session::save);
        session.flush();
        session.clear();
        transaction.commit();
        session.close();
    //    LOGGER.log(Level.INFO, "[ BATCH WITH SIZE OF " + list.size() + " SENT TO TABLE FactSalaryProject]");
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
