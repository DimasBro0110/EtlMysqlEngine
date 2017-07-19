package com.dimas.brosalin.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by DmitriyBrosalin on 18/07/2017.
 */

@Entity
@Table(name = "AIRLINE_CODES")
public class AirlineCodes {

    @Id
    @Column(name = "AIRLINE_CODE_ID")
    private String airLineCode;

    @Column(name = "AIRLINE_NAME")
    private String airLineName;

    public String getAirLineCode() {
        return airLineCode;
    }

    public void setAirLineCode(String airLineCode) {
        this.airLineCode = airLineCode;
    }

    public String getAirLineName() {
        return airLineName;
    }

    public void setAirLineName(String airLineName) {
        this.airLineName = airLineName;
    }
}
