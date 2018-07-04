package com.liuym.annotationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.liuym.myannotation.annotation.LiuymAnnotation;

@LiuymAnnotation(name = "MainActivity", description = "首页")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view) {
        com.liuym.annotationdemo.auto.MainActivity$$LIUYM mainActivity$$LIUYM = new com.liuym.annotationdemo.auto.MainActivity$$LIUYM();
        String message = mainActivity$$LIUYM.getMessage();
        ((TextView)view).setText(message);
    }
}
