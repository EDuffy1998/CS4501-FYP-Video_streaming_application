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
   Final Year Project CS4501:
   Project: Benchmarks For Many Core Smart Phones
   Project Supervisor: Dr. Dan Grigoras

   Application: Video Streaming Benchmark Application

   Purpose of Feature/Activity:
   - Purpose of this Feature/Activity is to be able to stream a video in a quality/resolution
   of 360p

   How the mobile device is monitored when performing this task:
   - To be able to monitor how the phone is coping with having to perform this task the Profiler
   tool which is built into the Android Studio IDE is being used.
   - The profiler tool allows us to monitor the following:
   - The CPU
   - The Battery
   - The Network
   - The Graphics
   - The Memory

 */
public class ThreeSixtyPixelsStreamTest extends AppCompatActivity {

    VideoView videoView;
    /*
        The onCreate method is called once the activity is loaded/activated by the user
        The content/ui is set to present the set layout in this case is "activity_three_sixty_pixels_stream_test"
        The media controller is initialised, this will contain the video being streamed by the user,
        The user can then interact with the media controller by performing functions such as rewind, pause & play
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_sixty_pixels_stream_test);

        MediaController mediaController = new MediaController(this);
        /*
            Previously initialized video view is now assigned a value containing it's ID
            Media controller is now as
            Anchor view is used to position the media controller, media player within the user interface
         */
        videoView = findViewById(R.id.video_view_360p);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        // Parsing the URL

        // Parses the URL of the video
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/cs4501-streaming-application.appspot.com/o/1080p.mp4?alt=media&token=1d1c7a23-3209-40a2-9bc0-4e94d75e79a6");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}