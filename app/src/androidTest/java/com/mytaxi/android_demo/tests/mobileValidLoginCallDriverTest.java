package com.mytaxi.android_demo.tests;

/**
 * Created by sourabhbidgely on 23/02/18.
 */

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.mytaxi.android_demo.generators.DriverDetailsGenerator;
import com.mytaxi.android_demo.generators.UserDetailsGenerator;
import com.mytaxi.android_demo.models.DriverDetails;
import com.mytaxi.android_demo.models.UserDetails;
import com.mytaxi.android_demo.pages.DriverDetailsPage;
import com.mytaxi.android_demo.pages.LoginPage;


@LargeTest
@RunWith(AndroidJUnit4.class)
public class mobileValidLoginCallDriverTest extends BaseTest {

    @Test
    public void mobileValidLoginCallDriverTest()
    {

        UserDetails userDetails = UserDetailsGenerator.getDefaultUserDetails();
        LoginPage loginPage = new LoginPage();
        loginPage.login(userDetails);
        BaseTest.idle();
        DriverDetails driverDetails = DriverDetailsGenerator.getFavouriteDriverDetails();
        DriverDetailsPage driverDetailsPage = new DriverDetailsPage();
        driverDetailsPage.selectAndCallDriver(driverDetails);

    }

}