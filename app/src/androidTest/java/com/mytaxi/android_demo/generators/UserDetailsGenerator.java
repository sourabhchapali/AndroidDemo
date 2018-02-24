package com.mytaxi.android_demo.generators;

import com.mytaxi.android_demo.models.UserDetails;

/**
 * Created by sourabhbidgely on 23/02/18.
 */

public class UserDetailsGenerator
{
    public static UserDetails getDefaultUserDetails()
    {
        UserDetails userDetails = new UserDetails();
        userDetails.setUserName("whiteelephant261");
        userDetails.setPassword("video");
        return userDetails;
    }


}
