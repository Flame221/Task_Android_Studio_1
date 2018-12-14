package com.company.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        log.d(TAG, "onCreate");
    }

    @Override
    protected void onPause(){
        super.onPause();
        log.d(TAG, "onPause");
    }

    @Override
    protected void onResume(){
        super.onResume();
        log.d(TAG, "onResume");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(outState);
        log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onStop(){
        super.onStop();
        log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        log.d(TAG, "onRestart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle onRestoreInstanceState){
        super.onRestoreInstanceState();
        log.d(TAG, "onRestoreInstanceState");
    }
}
