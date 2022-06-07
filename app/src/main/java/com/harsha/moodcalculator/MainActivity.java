package com.harsha.moodcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton Happy,Sad,Stress,Angry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Happy = findViewById(R.id.happyMoodBtn);
        Sad = findViewById(R.id.sadMoodBtn);
        Stress = findViewById(R.id.stressMoodBtn);
        Angry = findViewById(R.id.angryMoodBtn);

        Happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Share your Happiness with your dears!",Toast.LENGTH_LONG).show();
            }
        });

        Sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Please Get shower and talk with people. Remember that you are not Alone!",Toast.LENGTH_LONG).show();
            }
        });

        Stress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Have a KitKat Break!",Toast.LENGTH_LONG).show();
            }
        });

        Angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Cool buddy! Your anger will cost you problems.",Toast.LENGTH_LONG).show();
            }
        });
    }
}