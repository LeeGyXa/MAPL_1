package com.example.mapl_1;

import static android.graphics.Color.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("SetTextI18n")
    public void onBtnClick (View view){
        TextView txtText = findViewById(R.id.textMessage);
        txtText.setText("New Message!");
    }

    public void colorChanger (View view){

        TextView text = findViewById(R.id.textMessage);
        text.setTextColor(Color.rgb(200,18,120));
    }

}