package com.login.hepatohealthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        TextView t=(TextView)findViewById(R.id.textResult);
        //get score
        Bundle b = getIntent().getExtras();
        int score= b.getInt("score");

        switch (score)
        {
            case 0: t.setText("You may have moderate to high liver insufficieny.Its highly recommended to consult with a healthcare professional");
                break;
            case 1: t.setText("Its a wake-up-call , so start with good advice and look after your liver in your daily life");
                break;
            case 2: t.setText("Your liver is Healthy ! Maintain your liver Quality with consistent care");
                break;
            case 3: t.setText("Your liver is Healthy ! Maintain your liver Quality with consistent care");
                break;
            case 4:t.setText("Its a wake-up-call , so start with good advice and look after your liver in your daily life");
                break;
            case 5:t.setText("Awesome! You have a Healthy Liver !");
                break;

        }
    }

}
