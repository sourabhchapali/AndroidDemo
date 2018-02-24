package com.mytaxi.android_demo.models;

/**
 * Created by sourabhbidgely on 23/02/18.
 */

public class UserDetails
{

    public void setUserName(String userName)
    {
        this.userName=userName;
    }
    public String getUserName()
    {
        return this.userName;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getPassword()
    {
        return this.password;
    }

    private String userName;
    private String password;
}
