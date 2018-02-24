package com.mytaxi.android_demo.models;


/**
 * Created by sourabhbidgely on 23/02/18.
 */

public class DriverDetails
{

    public void setDriverName(String driverName)
    {
        this.driverName=driverName;
    }

    public String getDriverName()
    {
        return this.driverName;
    }
    public void setDriverNameSearchText(String driverNameSearchText)
    {
        this.driverNameSearchText=driverNameSearchText;
    }

    public String getdriverNameSearchText()
    {
        return this.driverNameSearchText;
    }


    private String driverName;
    private String driverNameSearchText;
}
