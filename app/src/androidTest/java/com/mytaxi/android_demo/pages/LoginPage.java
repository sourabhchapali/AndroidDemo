package com.mytaxi.android_demo.pages;

import android.support.test.espresso.ViewInteraction;
import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.models.UserDetails;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.typeText;




/**
 * Created by sourabhbidgely on 23/02/18.
 */

public class LoginPage
{
    ViewInteraction userName = onView(withId(R.id.edt_username));

    ViewInteraction password = onView(withId(R.id.edt_password));

    ViewInteraction loginButton = onView(withId(R.id.btn_login));

    public LoginPage login (UserDetails userDetails)
    {
        this.userName.perform(click()).perform(typeText(userDetails.getUserName()));
        this.password.perform(click()).perform(typeText(userDetails.getPassword()));
        this.loginButton.perform(click());
        return this;
    }

}
