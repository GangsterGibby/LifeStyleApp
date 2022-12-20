package com.example.healthapphomepagedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        ImageButton loginBtn = findViewById(R.id.imageButton7);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Username = findViewById(R.id.username);
                TextView Password = findViewById(R.id.password);
                TextView WrongPassword = findViewById(R.id.textView4);

                if(Username.getText().toString().equals("admin") && Password.getText().toString().equals("admin")){
                    Login(loginBtn);
                    WrongPassword.setVisibility(View.INVISIBLE);
                }

                else {
                    WrongPassword.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void Login (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

//        InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
//        inputMethodManager. hideSoftInputFromWindow(view. getApplicationWindowToken(),0);
    }
}