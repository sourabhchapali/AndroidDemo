package com.mytaxi.android_demo.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.rule.GrantPermissionRule;

import com.mytaxi.android_demo.activities.MainActivity;

import org.junit.Before;
import org.junit.Rule;

/**
 * Created by sourabhbidgely on 23/02/18.
 */

public class BaseTest
{

   @Rule
    public GrantPermissionRule permissionRule = GrantPermissionRule.grant(android.Manifest.permission.ACCESS_FINE_LOCATION);

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    public static MainActivity mainActivity = null;

    @Before
    public void setActivity() {
        mainActivity = mActivityTestRule.getActivity();
    }


    public static void idle()
    {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
