package com.login.hepatohealthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivty extends AppCompatActivity {

        Button Health_care;
        Button quiz;
        Button Find_your_doc;




        @Override
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home_activty);

            Health_care = findViewById(R.id.Health_care);
            quiz = findViewById(R.id.quiz);
            Find_your_doc = findViewById(R.id.Find_your_doc);

            Health_care.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent intent = new Intent(HomeActivty.this, HealthSlideActivity.class);
                    startActivity(intent);
                }
            });


            quiz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent intent = new Intent(HomeActivty.this, QuizActivity.class);
                    startActivity(intent);
                }
            });


           Find_your_doc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent intent = new Intent( HomeActivty.this,GoogleMapsActivity.class);
                    startActivity(intent);
                }
            });




        }
    }


