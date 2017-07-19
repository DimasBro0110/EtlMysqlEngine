package com.dimas.brosalin.test.dao;

import com.dimas.brosalin.test.model.AirportCodes;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * Created by DmitriyBrosalin on 19/07/2017.
 */
public class AirportCodesDAO extends HibernateDaoSupport {

    public void save(AirportCodes airportCodes){
        getHibernateTemplate().save(airportCodes);
    }

}
