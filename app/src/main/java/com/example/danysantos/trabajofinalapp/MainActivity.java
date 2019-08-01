package com.example.danysantos.trabajofinalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button MyButton = (Button) findViewById(R.id.button01);

        MyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(getApplicationContext(), otherActivity.class);
                startActivity(ListSong);
            }
        });

    }


    public  void Controller() {

    }

}
