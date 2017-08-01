package com.dimas.brosalin.production.model;

import javax.persistence.*;

/**
 * Created by DmitriyBrosalin on 20/07/2017.
 */

@Entity
@Table(name = "DIM_PRODUCT_GROUP")
public class DimProductGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entityId;

    @Column(name = "PRODUCT_GROUP_KEY")
    private String productGroupKey;

    @Column(name = "PRODUCT_MCS_NAME")
    private String productMcsName;


    public String getProductGroupKey() {
        return productGroupKey;
    }

    public void setProductGroupKey(String productGroupKey) {
        this.productGroupKey = productGroupKey;
    }

    public String getProductMcsName() {
        return productMcsName;
    }

    public void setProductMcsName(String productMcsName) {
        this.productMcsName = productMcsName;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }
}
