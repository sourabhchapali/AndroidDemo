package com.mytaxi.android_demo.pages;

import android.support.test.espresso.ViewInteraction;
import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.models.DriverDetails;
import com.mytaxi.android_demo.tests.BaseTest;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

/**
 * Created by sourabhbidgely on 23/02/18.
 */

public class DriverDetailsPage
{


    ViewInteraction clickCallButton = onView(withId(R.id.fab));
    ViewInteraction searchDriver = onView(withId(R.id.textSearch));
    ViewInteraction selectDriver;




    public DriverDetailsPage selectAndCallDriver(DriverDetails driverDetails)
    {

        this.searchDriver.perform(typeText(driverDetails.getdriverNameSearchText()),closeSoftKeyboard());
        this.selectDriver=onView(withText(driverDetails.getDriverName())).inRoot(withDecorView(not(is(BaseTest.mainActivity.getWindow().getDecorView())))).perform(click());
        this.clickCallButton.perform(click());
        return this;

    }



}
