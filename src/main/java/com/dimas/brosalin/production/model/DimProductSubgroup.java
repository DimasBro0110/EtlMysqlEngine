package com.dimas.brosalin.production.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by DmitriyBrosalin on 20/07/2017.
 */

@Entity
@Table(name = "DIM_PRODUCT_SUBGROUP")
public class DimProductSubgroup {

    @Id
    @Column(name = "PRODUCT_SUBGROUP_KEY")
    private String productSubgroupKey;

    @Column(name = "PRODUCT_SUBGROUP_NAME")
    private String productSubgroupName;

    @Column(name = "PRODUCT_GROUP_KEY")
    private String productGroupKey;

    public String getProductSubgroupKey() {
        return productSubgroupKey;
    }

    public void setProductSubgroupKey(String productSubgroupKey) {
        this.productSubgroupKey = productSubgroupKey;
    }

    public String getProductSubgroupName() {
        return productSubgroupName;
    }

    public void setProductSubgroupName(String productSubgroupName) {
        this.productSubgroupName = productSubgroupName;
    }

    public String getProductGroupKey() {
        return productGroupKey;
    }

    public void setProductGroupKey(String productGroupKey) {
        this.productGroupKey = productGroupKey;
    }
}
