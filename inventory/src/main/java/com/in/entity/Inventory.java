package com.in.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "inventorydata")
public class Inventory {
    @Id
    private String pId;
    private String pName;
    private String pQuantity;
    private String pCost;

    public Inventory(String pId, String pName, String pQuantity, String pCost) {
        this.pId = pId;
        this.pName = pName;
        this.pQuantity = pQuantity;
        this.pCost = pCost;
    }

    public Inventory() {
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(String pQuantity) {
        this.pQuantity = pQuantity;
    }

    public String getpCost() {
        return pCost;
    }

    public void setpCost(String pCost) {
        this.pCost = pCost;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "pId='" + pId + '\'' +
                ", pName='" + pName + '\'' +
                ", pQuantity='" + pQuantity + '\'' +
                ", pCost='" + pCost + '\'' +
                '}';
    }
}
