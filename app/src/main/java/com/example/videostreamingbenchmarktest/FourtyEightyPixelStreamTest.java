package com.example.videostreamingbenchmarktest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/*
    Student Name: Edward Duffy
    Student Number: 117501529
    Date: 01/01/2021
    Final Year Project: CS4501
    Project: Benchmarks For Many Core Smart Phones
    Project Supervisor: Dr. Dan Grigoras

    Application: Video Streaming Benchmark Application

    Purpose of feature/Activity:
    - To be able to stream content of a resolution of 240p and display it to the user

    How the phone/mobile device is being monitored:
    - The phone/mobile device is being monitored by using the profiler tool which is built into
    Android Studio
    - The profiler tool will allow us to monitor the following aspects of the phone/mobile device:
    - The CPU
    - The Battery
    - The Memory
    - The Graphics
    - The Network

 */
public class FourtyEightyPixelStreamTest extends AppCompatActivity {
    VideoView videoView;
    /*
        The onCreate method is called once the activity is loaded/activated by the user
        The content/ui is set to present the set layout in this case is "activity_fourty_eighty_pixel_stream_test"
        The media controller is initialised, this will contain the video being streamed by the user,
        The user can then interact with the media controller by performing functions such as rewind, pause & play
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourty_eighty_pixel_stream_test);

        MediaController mediaController = new MediaController(this);

         /*
            Previously initialized video view is now assigned a value containing it's ID
            Media controller is now as
            Anchor view is used to position the media controller, media player within the user interface
         */
        videoView = findViewById(R.id.video_view_480p);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        /*
            URL is parsed using Uri

            A uri is an object that is used to inform a content provider (In this case Firebase)
            the content that needs to be accessed by creating a one to one mapping to that resource data using
            a url.

            Once the URL is parsed, the video to be played by the mediaplayer is now set to the resource data
            specified
         */
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/cs4501-streaming-application.appspot.com/o/480p.mp4?alt=media&token=492104a3-4928-4a56-801d-959afb681f8e");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}