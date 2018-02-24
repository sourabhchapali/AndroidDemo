package com.mytaxi.android_demo.generators;

import com.mytaxi.android_demo.models.DriverDetails;

/**
 * Created by sourabhbidgely on 23/02/18.
 */

public class DriverDetailsGenerator
{
    public static DriverDetails getFavouriteDriverDetails()
    {
        DriverDetails driverDetails = new DriverDetails();
        driverDetails.setDriverName("Sarah Friedrich");
        driverDetails.setDriverNameSearchText("sa");
        return driverDetails;
    }
}

