package com.example.healthapphomepagedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MorePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_page);
    }

    public void toDashboard(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toSettings(View view){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}