package com.example.runtimeannotationprocessor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.runtimeannotationprocessor.bean.Apple;
import com.example.runtimeannotationprocessor.processor.AnnotationProcessor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnnotationProcessor.getFruitInfo(Apple.class);
    }
}
