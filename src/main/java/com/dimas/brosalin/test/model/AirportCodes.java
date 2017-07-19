package com.dimas.brosalin.test.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by DmitriyBrosalin on 18/07/2017.
 */

@Entity
@Table(name = "AIRPORT_CODES")
public class AirportCodes {

    @Id
    @Column(name = "AIRPORT_CODE")
    private String airPortCode;

    @Column(name = "AIRPORT_NAME")
    private String airPortName;

    public String getAirPortCode() {
        return airPortCode;
    }

    public void setAirPortCode(String airPortCode) {
        this.airPortCode = airPortCode;
    }

    public String getAirPortName() {
        return airPortName;
    }

    public void setAirPortName(String airPortName) {
        this.airPortName = airPortName;
    }
}
