package com.example.healthapphomepagedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }

    public void Login (View view){
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }

    public void Signup (View view){
        Intent intent = new Intent(this, SignUpPage.class);
        startActivity(intent);
    }
}