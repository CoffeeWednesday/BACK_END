package com.carrotmarket.clone.community.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Seeker {
    @Id
    @GeneratedValue
    private long skNo;
    private String skName;
    private String skPhn;
    private String skAddr;
    private int skAge;
    private String skSex;

    public Seeker(){}
    public Seeker(long skNo, String skName, String skPhn, String skAddr, int skAge, String skSex){
        this.skNo = skNo;
        this.skName = skName;
        this.skPhn = skPhn;
        this.skAddr = skAddr;
        this.skAge = skAge;
        this.skSex = skSex;
    }

    public long getSkNo() {
        return skNo;
    }
    public String getSkPhn() {
        return skPhn;
    }
    public String getSkAddr() {
        return skAddr;
    }
    public int getSkAge() {
        return skAge;
    }
    public String getSkSex() {
        return skSex;
    }
    public String getSkName() {
        return skName;
    }

    @Override
    public String toString() {
        return "skner [skNo = " + skNo + ", skName = " + skName + ", skPhn = " + skPhn + ", skAge = " + skAge + ", skSex = " + skSex + ", skAddr = " + skAddr + "]";
    }

}
