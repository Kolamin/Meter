package com.anton.abonent;

import com.anton.devices.WaterMeter;

public class Person {
    private String fname;
    private String sname;

    private String address;

    public Person(String fname, String sname, String address) {
        this.fname = fname;
        this.sname = sname;
        this.address = address;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void getWatermeter(WaterMeter waterMeter){

        System.out.println(String.format("Счетчик - %s , марка - %s",  waterMeter.getName(),  waterMeter.getBrand()));
    }
}
