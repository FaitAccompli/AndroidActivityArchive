package com.example.majoractivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
