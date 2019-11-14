package com.anton;

import com.anton.devices.WaterMeter;

public class Main {
    public static void main(String[] args) {
        WaterMeter waterMeter = new WaterMeter(Medium.WATER,
                "Бетар",
                "Россия",
                "СГБМ-1,6",
                15, 1.6, 5, 1.6, 0.0);

        System.out.println(waterMeter.toString());
    }
}
