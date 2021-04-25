package com.example.videostreamingbenchmarktest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.math.MathContext;

/*
    Student Name: Edward Duffy
    Student Number: 117501529
    Date: 31/12/2020
    Final Year Project:
    Project: Benchmarks For Many Core Smart Phones
    Project Supervisor: Dr.Dan Grigoras

    Application: Video Streaming Benchmark Application

    Activity/Feature:
    - The Main Activity is just a hub/screen where the user can choose to test their phone to see if
    it can stream a video of a certain resolution
    - The resolutions/Quality available to test are the following:
    - 144p
    - 240p
    - 360p
    - 480p
    - 720p
    - 1080p

    Goal/Purpose of this application:
    - The purpose of this application is to be able to see how the phone copes with being tasked with the following:
    - Streaming a video from a database(The database I chose to use was Firebase as I had some familiarity
    with it from my 3rd year team software project and my 3rd year Workplace Skills project as well
    as the Special Topics in Computing Module

    How the mobile is monitored when it's given the task of streaming content:
    - To be able to monitor how the phone is coping when it's set with this task i'm using the
    Profiler tool which is built into the Android Studio IDE.
    - Using the Profiler tool I'm able to monitor the following aspects of the mobile device:
    - The CPU
    - Memory
    - Graphics
    - Network

    Why I felt this was an important task to benchmark and test:
    - I feel that while it was important seeing how a mobile device handled the task of playing a
    video locally, it's also important to see and understand how a mobile device handles the task of
    receiving video from an online database and being able to present the video to the user in a timely
    manner while also dealing with the quality/resolution of the video which could range from 144p - 1080p
    - This is important as it's becoming the norm/very popular to stream content such as video on your
    our mobile devices using applications such as YouTube, Netflix, Amazon Prime, Live events
    - It's important to see if your mobile device is not only able to stream content but also at what quality
    provides us with the best results as while 720p - 1080p may be desirable ny users it may not be
    the most efficient in terms of preserving battery life and will work your CPU more.

 */
public class MainActivity extends AppCompatActivity {

    /*
        Application starts &  the user is presented with the user interface
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        Function mapped to the 1080p button
        When the user presses the button, this method is invoked
        A text bubble is created using toast.makeText informing the user of the resolution picked
        Intent is created which maps to the class containing the resolution of video to stream that the user has chosen
        Intent is passed as a parameter to the startActivity method
        User is passed to their chosen activity containing the resolution video they have chosen to stream
     */
    public void ThousandEightyPixelsTest(android.view.View view){
        Toast.makeText(MainActivity.this,"Going to stream video in 1080p",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getBaseContext(),ThousandEightyPixelStreamTest.class);
        startActivity(myIntent);
    }
    /*
        Function mapped to the 720p button
        When the user presses the button, this method is invoked
        A text bubble is created using toast.makeText informing the user of the resolution picked
        Intent is created which maps to the class containing the resolution of video to stream that the user has chosen
        Intent is passed as a parameter to the startActivity method
        User is passed to their chosen activity containing the resolution video they have chosen to stream
     */
    public void SevenTwentyPixelsTest(android.view.View view){
        Toast.makeText(MainActivity.this,"Going to stream video in 720p",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getBaseContext(),SevenTwentyPixelStreamTest.class);
        startActivity(myIntent);
    }
    /*
        Function mapped to the 480p button
        When the user presses the button, this method is invoked
        A text bubble is created using toast.makeText informing the user of the resolution picked
        Intent is created which maps to the class containing the resolution of video to stream that the user has chosen
        Intent is passed as a parameter to the startActivity method
        User is passed to their chosen activity containing the resolution video they have chosen to stream
     */
    public void FourEightyPixelsTest(android.view.View view){
        Toast.makeText(MainActivity.this,"Going to stream video in 480p",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getBaseContext(),FourtyEightyPixelStreamTest.class);
        startActivity(myIntent);
    }
    /*
        Function mapped to the 360p button
        When the user presses the button, this method is invoked
        A text bubble is created using toast.makeText informing the user of the resolution picked
        Intent is created which maps to the class containing the resolution of video to stream that the user has chosen
        Intent is passed as a parameter to the startActivity method
        User is passed to their chosen activity containing the resolution video they have chosen to stream
     */
    public void ThreeSixtyPixelsTest(android.view.View view){
        Toast.makeText(MainActivity.this,"Going to stream video in 360p",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getBaseContext(),ThreeSixtyPixelsStreamTest.class);
        startActivity(myIntent);
    }
    /*
        Function mapped to the 240p button
        When the user presses the button, this method is invoked
        A text bubble is created using toast.makeText informing the user of the resolution picked
        Intent is created which maps to the class containing the resolution of video to stream that the user has chosen
        Intent is passed as a parameter to the startActivity method
        User is passed to their chosen activity containing the resolution video they have chosen to stream
     */
    public void TwoFourtyPixelsTest(android.view.View view){
        Toast.makeText(MainActivity.this,"Going to stream video in 240p",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getBaseContext(),TwoFourtyPixelStreamTest.class);
        startActivity(myIntent);
    }
    /*
        Function mapped to the 144p button
        When the user presses the button, this method is invoked
        A text bubble is created using toast.makeText informing the user of the resolution picked
        Intent is created which maps to the class containing the resolution of video to stream that the user has chosen
        Intent is passed as a parameter to the startActivity method
        User is passed to their chosen activity containing the resolution video they have chosen to stream
     */
    public void OneFourtyFourPixelsTest(android.view.View view){
        Toast.makeText(MainActivity.this,"Going to stream video in 144p",Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(getBaseContext(),OneFourtyFourPixelStreamTest.class);
        startActivity(myIntent);
    }

}