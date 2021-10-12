package com.example.helloyou_simplegui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

    public void onClick(View view) {
        System.out.println("Hello!");
    }
}