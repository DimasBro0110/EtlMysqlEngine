package com.dimas.brosalin.production.writer;

import com.dimas.brosalin.production.model.FactAccount_Oper_CDW;
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
public class FactAccount_Oper_CDWWriter implements ItemWriter<FactAccount_Oper_CDW> {

    private SessionFactory sessionFactory;
    private String threadName;
    private static Logger LOGGER = Logger.getLogger(FactAccount_Oper_CDWWriter.class.getName());

    @Override
    public void write(List<? extends FactAccount_Oper_CDW> list) throws Exception {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        list.forEach(session::save);
        session.flush();
        session.clear();
        transaction.commit();
        session.close();
        LOGGER.log(Level.INFO, this.threadName + " "
                + "BATCH WITH SIZE OF " + list.size() + " SENT TO TABLE FactAccount_Oper_CDWWriter");
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
}
