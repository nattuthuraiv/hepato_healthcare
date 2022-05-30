package com.login.hepatohealthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;



public class HealthSlideActivity extends AppCompatActivity {


    ViewFlipper viewFlipper;
    Button next;
    Button previous;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_slide);

        viewFlipper = findViewById(R.id.viewFlipper);
        next = (Button) findViewById(R.id.next);
        previous = (Button) findViewById(R.id.previous);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == next) {
                    viewFlipper.showNext();
                }

            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == previous) {
                    viewFlipper.showPrevious();
                }

            }
        });






    }

}

