package com.example.helloyou_simplegui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// Utilize this library for the view class: https://developer.android.com/reference/android/view/View
import android.view.View;

/**
 *
 * @name Hello, You! Simple GUI Activity
 * @description Console output is an important tool to have as a developer that uses a console/text interface. Most applications we deal with daily use some form of a Graphical User Interface or GUI. This means it has its images, buttons, windows, and many of the features we associate with a typical app or program. In this exercise, we will build our first, simple GUI.
 * @author Xander Endre
 * @date 12 October 2021
 * @class CSC110
 *
 */


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*
     * TODO LIST:
     *  [x] Create a new project in Android Studio
     *  [x] Choose an Empty Activity
     *  [x] Add three Plain Text (EditText) widgets to your layout
     *  [x] The first should hint for the user's first name
     *  [x] The second should hint for the user's last name
     *  [x] The third one will be used for output
     *  [x] Add a button widget with an event handler
     *  [] When the button is pressed, the following should happen:
     *      [] The text from the first name box should be put in a string variable called 'firstName'
     *      [] The text from the last name box should be put in a string variable called 'lastName'
     *      [] A new string variable called 'greeting' should be created
     *          [] Set the value of this variable as a concatenation of "Hello ", firstName and lastName
     *      [] Put the value of 'greeting' into the third Plain Text (EditText) widget
     */

    /* Event Handler */
    public void onSubmission(View view) {
        String firstName;
        String lastName;
        String greeting;


    }
}