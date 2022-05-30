package com.login.hepatohealthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

EditText username,password,repassword;
Button login,register;
DBHelper1 myDB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        repassword = (EditText) findViewById(R.id.repassword);
        login = (Button)findViewById(R.id.login);
        register = (Button)findViewById(R.id.register);


myDB = new DBHelper1(this);

register.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        String user = username.getText().toString();
        String pass = password.getText().toString();
        String repass = repassword.getText().toString();

        if (user.equals("") || pass.equals("") || repass.equals("")) {
            Toast.makeText(MainActivity.this, "Fill all the fields", Toast.LENGTH_SHORT).show();
        } else {


            if (pass.equals(repass)) {
                Boolean usercheckresult = myDB.checkusername(user);
                if (usercheckresult == false) {
                    Boolean regresult = myDB.insertData(user, pass);
                    if (regresult == true) {
                        Toast.makeText(MainActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(intent);

                    } else {

                        Toast.makeText(MainActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "User Already Exists . Please Login", Toast.LENGTH_SHORT).show();
                }

            } else {
                Toast.makeText(MainActivity.this, "Password not matching", Toast.LENGTH_SHORT).show();
            }


        }
    }
});

login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }
});


    }
}