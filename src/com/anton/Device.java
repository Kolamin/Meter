package com.anton;

public class Device {

    private Medium medium;

    public Device(Medium medium, String brand, String country,String name, int borediameter, double max_flow, int temper_work, double rated_flow, double meter_reading) {
        this.medium = medium;
        this.brand = brand;
        this.country = country;
        this.name = name;
        this.borediameter = borediameter;
        this.max_flow = max_flow;
        this.temper_work = temper_work;
        this.rated_flow = rated_flow;
        this.meter_reading = meter_reading;
    }

    private String name;

    @Override
    public String toString() {
        return "Device{" +
                "Измеряемая среда - " + medium + '\n' +
                ", Наименование счетчика ='" + name  + '\'' + '\n'+
                ", Бренд ='" + brand + '\'' + '\n'+
                ", Страна ='" + country + '\'' +'\n'+
                ", Условный проход =" + borediameter +'\n'+
                ", Максимальный расход = " + max_flow +'\n'+
                ", Рабочая температура = " + temper_work + " 0C" +'\n'+
                ", Номинальный расход = " + rated_flow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Medium getMedium() {
        return medium;
    }

    //Бренд
    private String brand;

    //Страна
    private String country;

    //Условный проход
    private int borediameter;

    //Максимальный расход
    private double max_flow;

    //Рабочая температура
    private int temper_work;

    //Номинальный расход
    private double rated_flow;

    //Показания счетчика
    private double meter_reading;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getBorediameter() {
        return borediameter;
    }

    public void setBorediameter(int borediameter) {
        this.borediameter = borediameter;
    }

    public double getMax_flow() {
        return max_flow;
    }

    public void setMax_flow(double max_flow) {
        this.max_flow = max_flow;
    }

    public int getTemper_work() {
        return temper_work;
    }

    public void setTemper_work(int temper_work) {
        this.temper_work = temper_work;
    }

    public double getRated_flow() {
        return rated_flow;
    }

    public void setRated_flow(double rated_flow) {
        this.rated_flow = rated_flow;
    }

    public double getMeter_reading() {
        return meter_reading;
    }

    public void setMeter_reading(double meter_reading) {
        this.meter_reading = meter_reading;
    }

}
