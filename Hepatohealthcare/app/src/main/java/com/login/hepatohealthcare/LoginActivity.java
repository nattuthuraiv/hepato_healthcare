package com.login.hepatohealthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    EditText username,password;
    Button login;
    DBHelper1 myDB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.usernamelogin);
        password = (EditText) findViewById(R.id.passwordlogin);
        login = (Button) findViewById(R.id.login1);


        myDB = new DBHelper1(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();


                if (user.equals("") || pass.equals("")) {
                    Toast.makeText(LoginActivity.this, "Please enter the credentials", Toast.LENGTH_SHORT).show();
                }
                 else{


                    Boolean result = myDB.checkusernamepassword(user, pass);

                        if (result == true) {

                            Intent intent = new Intent(LoginActivity.this, HomeActivty.class);
                            startActivity(intent);

                        }

                        else {
                            Toast.makeText(LoginActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                        }


                }
            }
        });

    }}



