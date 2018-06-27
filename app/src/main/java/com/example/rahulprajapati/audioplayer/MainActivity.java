  package com.example.rahulprajapati.audioplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

 public class MainActivity extends AppCompatActivity {
     MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mediaPlayer = MediaPlayer.create(this,R.raw.just_the_way_you_are);


    }

     public void play(View view) {
         mediaPlayer.start();
     }

     public void pause(View view) {
         mediaPlayer.pause();
     }

     public void stop(View view) {
         mediaPlayer.stop();
     }
 }
