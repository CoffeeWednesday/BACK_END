package com.carrotmarket.clone.community.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private long poNo;
    private String poTitle;
    private String poJob;
    private String poDate;
    private String poImg;
    private long poSal;
    private long poOw;
    private long poSk;

    public Post(){}

    public Post(long poNo, String poTitle, String poJob, String poDate, String poImg, long poSal, long poOw, long poSk){
        this.poNo = poNo;
        this.poTitle = poTitle;
        this.poJob = poJob;
        this.poDate = poDate;
        this.poImg = poImg;
        this.poSal = poSal;
        this.poOw = poOw;
        this.poSk = poSk;
    }
    
    public long getPoNo() {
        return poNo;
    }

    public String getPoTitle() {
        return poTitle;
    }

    public String getPoJob() {
        return poJob;
    }

    public String getPoDate() {
        return poDate;
    }

    public String getPoImg() {
        return poImg;
    }

    public long getPoSal() {
        return poSal;
    }

    public long getPoOw() {
        return poOw;
    }

    public long getPoSk() {
        return poSk;
    }

    @Override
    public String toString() {
        return "Post [poNo=" + poNo + ", poTitle=" + poTitle + ", poJob=" + poJob + ", poDate=" + poDate + ", poImg="
                + poImg + ", poSal=" + poSal + ", poOw=" + poOw + ", poSk=" + poSk + "]";
    }

}
