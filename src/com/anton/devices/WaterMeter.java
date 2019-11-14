package com.anton.devices;

import com.anton.Device;
import com.anton.Medium;

public class WaterMeter extends Device {
    public WaterMeter(Medium medium, String brand, String country, String name, int borediameter, double max_flow, int temper_work, double rated_flow, double meter_reading) {
        super(medium, brand, country,name, borediameter, max_flow, temper_work, rated_flow, meter_reading);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
