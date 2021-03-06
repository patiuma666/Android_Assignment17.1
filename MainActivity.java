package com.example.iis5.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
//created main class called Mainactivity which extends appCompactactivity
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//declaring widgets variables
    Button startButton, stopButton;

    //onCreate method is called by  creating main activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//implementing button id's from the layout xml file which alocates the id
        startButton = (Button) findViewById(R.id.start_button);
        stopButton = (Button) findViewById(R.id.stop_button);
        //setting onclick listener by clicking start button to it displays the toast of the particular action
        startButton.setOnClickListener(MainActivity.this);
        //setting onclick listener by clicking stop button to it displays the toast of the particular action
        stopButton.setOnClickListener(MainActivity.this);

    }
//implementing onClick view method
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_button:// Play audio from the start service intent of context MyMusic.class
                startService(new Intent(this, MyMusic.class));
                Toast.makeText(this, " Music Started", Toast.LENGTH_LONG).show();
                break;
            case R.id.stop_button:// Pause audio
                stopService(new Intent(this, MyMusic.class));
                Toast.makeText(this, " Music Stopped", Toast.LENGTH_LONG).show();
                break;
        }
    }


}
