package com.example.healthapphomepagedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RadioButton switchWidget = findViewById(R.id.radioButton6);
        RadioButton switchWidgetBack = findViewById(R.id.radioButton5);
        ImageView widget1 = findViewById(R.id.rectangleCalories);
        ImageView widget2 = findViewById(R.id.loadingCirckelImage);
        ImageView widget3 = findViewById(R.id.textCalories);
        ImageView widget4 = findViewById(R.id.rectangleCalories2);
        ImageView widget5 = findViewById(R.id.imageView);
        ImageView widget6 = findViewById(R.id.imageView2);
        ImageView widget7 = findViewById(R.id.imageView8);
        ImageView widget8 = findViewById(R.id.imageView9);
        ImageView widget9 = findViewById(R.id.imageView10);

        switchWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switchWidget.isChecked()){
                    widget1.setVisibility(View.INVISIBLE);
                    widget2.setVisibility(View.INVISIBLE);
                    widget3.setVisibility(View.INVISIBLE);
                    widget5.setVisibility(View.INVISIBLE);
                    widget6.setVisibility(View.INVISIBLE);
                    widget7.setVisibility(View.INVISIBLE);

                    widget4.setVisibility(View.VISIBLE);
                    widget8.setVisibility(View.VISIBLE);
                    widget9.setVisibility(View.VISIBLE);
                }

                else if(!switchWidget.isChecked() && !switchWidgetBack.isChecked()){
                    widget1.setVisibility(View.VISIBLE);
                    widget2.setVisibility(View.VISIBLE);
                    widget3.setVisibility(View.VISIBLE);
                    widget5.setVisibility(View.VISIBLE);
                    widget6.setVisibility(View.VISIBLE);
                    widget7.setVisibility(View.VISIBLE);
                }
            }
        });

        switchWidgetBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switchWidgetBack.isChecked()){
                    widget1.setVisibility(View.VISIBLE);
                    widget2.setVisibility(View.VISIBLE);
                    widget3.setVisibility(View.VISIBLE);
                    widget5.setVisibility(View.VISIBLE);
                    widget6.setVisibility(View.VISIBLE);
                    widget7.setVisibility(View.VISIBLE);

                    widget4.setVisibility(View.INVISIBLE);
                    widget8.setVisibility(View.INVISIBLE);
                    widget9.setVisibility(View.INVISIBLE);
                }

                else if(!switchWidget.isChecked() && !switchWidgetBack.isChecked()){
                    widget1.setVisibility(View.VISIBLE);
                    widget2.setVisibility(View.VISIBLE);
                    widget3.setVisibility(View.VISIBLE);
                    widget5.setVisibility(View.VISIBLE);
                    widget6.setVisibility(View.VISIBLE);
                    widget7.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}