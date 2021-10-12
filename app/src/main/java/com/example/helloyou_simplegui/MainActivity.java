package com.example.helloyou_simplegui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
// Utilize this library for the view class: https://developer.android.com/reference/android/view/View
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


/**
 * @author Xander Endre
 * @name Hello, You! Simple GUI Activity
 * @project_description Console output is an important tool to have as a developer that uses a console/text interface. Most applications we deal with daily use some form of a Graphical User Interface or GUI. This means it has its images, buttons, windows, and many of the features we associate with a typical app or program. In this exercise, we will build our first, simple GUI.
 * @date 12 October 2021
 * @class CSC110
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
     *      [x] The text from the first name box should be put in a string variable called 'firstName'
     *      [x] The text from the last name box should be put in a string variable called 'lastName'
     *      [x] A new string variable called 'greeting' should be created
     *          [x] Set the value of this variable as a concatenation of "Hello ", firstName and lastName
     *      [x] Put the value of 'greeting' into the third Plain Text (EditText) widget
     */

    /* Event Handler */
    public void onSubmission(View view) {
        // Cast EditText Class to finding the specific ID.
        EditText etFirstName = (EditText) findViewById(R.id.etFirstName);
        // (Viewing Purposes) Print the ID.
        System.out.println("FIRST NAME ID: " + etFirstName);
        // Store the EditText into a String by grabbing its text and converting it to a string
        String firstName = etFirstName.getText().toString();
        // Print the stringified version of the input
        System.out.println("First Name: " + firstName);

        // Cast EditText Class to finding the specific ID.
        EditText etLastName = (EditText) findViewById(R.id.etLastName);
        // (Viewing Purposes) Print the ID.
        System.out.println("LAST NAME ID: " + etLastName);
        // Store the EditText into a String by grabbing its text and converting it into a string.
        String lastName = etLastName.getText().toString();
        // Print the stringified version of the input
        System.out.println(lastName);

        // Define a string to store the greeting by concatenation the first and last name.
        String greeting = "Hello, " + firstName + " " + lastName;
        // Print the gretting for testing purposes
        System.out.println(greeting);

        // Grab the output box ID
        TextView tvOutput = (TextView) findViewById(R.id.tvOutput);
        // Set it's text value to be equal to the greeting value.
        tvOutput.setText(greeting);



    }
}