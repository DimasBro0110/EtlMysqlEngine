package com.dimas.brosalin.test.dao;

import com.dimas.brosalin.test.model.AirlineCodes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by DmitriyBrosalin on 19/07/2017.
 */
public class AirlineCodesDAO extends HibernateDaoSupport{

    public void save(AirlineCodes airlineCodes){
        getHibernateTemplate().save(airlineCodes);
    }

}
