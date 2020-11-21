package com.udacity.pricing;

public class TestUtil {

    public static Integer getRandomVehicleId(){
        return ((int) (Math.random()*(100 - 1))) + 1;
    }
}
