package com.example.videostreamingbenchmarktest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/*
   Student Name: Edward Duffy
   Student Number: 117501529
   Date: 31/12/2020
   Final Year Project:
   Project: Benchmarks For Many Core Smart Phones
   Project Supervisor: Dr. Dan Grigoras

   Application: Streaming Video Benchmark Application

   Purpose of this feature/Activity:
   - The purpose of this feature/activity is to stream a video of a quality/resolution of 144p and
   displaying it that to the user in a timely manner

   How phone is monitored:
   - The phone is monitored using the Android Profiler tool which is built into the Android Studio
   IDE,
   - The following aspects of the mobile device will be monitored
   - CPU
   - Battery
   - Graphics
   - Memory
   - The Network


 */
public class OneFourtyFourPixelStreamTest extends AppCompatActivity {

    VideoView videoView;
    /*
        The onCreate method is called once the activity is loaded/activated by the user
        The content/ui is set to present the set layout in this case is "activity_one_fourty_four_pixel_stream_test"
        The media controller is initialised, this will contain the video being streamed by the user,
        The user can then interact with the media controller by performing functions such as rewind, pause & play
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_fourty_four_pixel_stream_test);

        MediaController mediaController = new MediaController(this);
        /*
            Previously initialized video view is now assigned a value containing it's ID
            Media controller is now as
            Anchor view is used to position the media controller, media player within the user interface
         */
        videoView = findViewById(R.id.video_view_144p);
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
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/cs4501-streaming-application.appspot.com/o/144p.mp4?alt=media&token=ab72e5da-1c33-4120-9b50-90f43f2b47a1");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}