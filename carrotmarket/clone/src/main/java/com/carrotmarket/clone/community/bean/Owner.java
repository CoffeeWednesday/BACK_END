package com.carrotmarket.clone.community.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Owner {
    @Id
    @GeneratedValue
    private long owNo;
    private String owName;
    private String owPhn;
    private long owBnsNO;
    private String owAddr;

    public Owner(){}
    public Owner(long owNo, String owName, String owPhn, long owBnsNO, String owAddr){
        this.owNo = owNo;
        this.owName = owName;
        this.owPhn = owPhn;
        this.owBnsNO = owBnsNO;
        this.owAddr = owAddr;
    }

    public String getOwAddr() {
        return owAddr;
    }
    public String getOwName() {
        return owName;
    }
    public long getOwNo() {
        return owNo;
    }
    public long getOwBnsNO() {
        return owBnsNO;
    }
    public String getOwPhn() {
        return owPhn;
    }
    @Override
    public String toString() {
        return "Owner [owNo = " + owNo + ", owName = " + owName + ", owPhn = " + owPhn + ", owBnsNo = " + owBnsNO + ", owAddr = " + owAddr + "]";
    }
}
