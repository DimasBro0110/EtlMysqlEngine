package com.dimas.brosalin.production.model;

import javax.persistence.*;

/**
 * Created by DmitriyBrosalin on 20/07/2017.
 */

@Entity
@Table(name = "FACT_CASE_INCIDENT")
public class FactCaseIncident {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entityId;

    @Column(name = "FACT_CASE_KEY")
    private String factCaseKey;

    @Column(name = "FACT_INCIDENT_KEY")
    private String factIncidentKey;

    public String getFactCaseKey() {
        return factCaseKey;
    }

    public void setFactCaseKey(String factCaseKey) {
        this.factCaseKey = factCaseKey;
    }

    public String getFactIncidentKey() {
        return factIncidentKey;
    }

    public void setFactIncidentKey(String factIncidentKey) {
        this.factIncidentKey = factIncidentKey;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }
}
