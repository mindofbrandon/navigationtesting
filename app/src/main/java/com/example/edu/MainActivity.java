package com.example.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO: have app learn when user is already logged in, vs new user so that it doesnt always jump to sign up page
        setContentView(R.layout.activity_main); // when app launches, display activity_main xml



    }
}