package com.example.majoractivity1;


import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {

    Handler handler;
    Toast toast;
    String[] stringArray = {
            "[01] Linear Layout Activity (Feb. 10)",
            "[02] Constraint Layout (Feb. 12)",
            "[03] Toast Activity (Feb. 14)",
            "[04] Button Activity (Feb. 19)",
            "[06] Conversion Activity (Feb. 28)",
            "[07] Profile Activity (Mar. 2)",
            "[08] List View Activity (Mar. 4)"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.activity_listview, stringArray);
        ListView listView =  findViewById(R.id.list_view);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(MainActivity.this, LinearLayout.class);
                                startActivity(intent);
                            }
                        }, 500);
                        break;
                    case 1:
                        handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(MainActivity.this, ConstraintLayout.class);
                                startActivity(intent);
                            }
                        }, 500);
                        break;
                    case 2:
                        handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(MainActivity.this, ToastActivity.class);
                                startActivity(intent);
                            }
                        }, 500);
                        break;
                    case 3:
                        handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
                                startActivity(intent);
                            }
                        }, 500);
                        break;
                    case 4:
                        handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                                startActivity(intent);
                            }
                        }, 500);
                        break;
                    case 5:
                        handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(MainActivity.this, Profile.class);
                                startActivity(intent);
                            }
                        }, 500);
                        break;
                    case 6:
                        handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                                startActivity(intent);
                            }
                        }, 500);
                        break;

                }

            }
        });

    }
    @Override
    public void onBackPressed()
    {
        toast = Toast.makeText(MainActivity.this, "Successfully Logged Out!", Toast.LENGTH_SHORT);
        toast.show();
        super.onBackPressed();
        this.finish();
    }
}

