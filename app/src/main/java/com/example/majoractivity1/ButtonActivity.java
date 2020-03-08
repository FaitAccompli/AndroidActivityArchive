package com.example.majoractivity1;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity implements View.OnClickListener {

 /* id list
    bgRect = background
    redBtn = red button
    blueBtn = blue button
    greenBtn = green button
    clearBtn = clear button
    messageTxt = text for message */

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        Button red_Button = findViewById(R.id.redBtn);
        Button green_Button =  findViewById(R.id.greenBtn);
        Button blue_Button =  findViewById(R.id.blueBtn);
        Button clear_Button =  findViewById(R.id.clearBtn);

        try{
            red_Button.setOnClickListener(this);
            green_Button.setOnClickListener(this);
            blue_Button.setOnClickListener(this);
            clear_Button.setOnClickListener(this);
        }
        catch (Exception e){

        }
    }

    @Override
    public void onClick(View arg0) {
        LinearLayout bg_Rect = findViewById(R.id.bgRect);
        TextView msg = findViewById(R.id.messageTxt);


        switch (arg0.getId()) {
            case R.id.redBtn:
                toast = Toast.makeText(this, "Clicked Red Button!", Toast.LENGTH_SHORT);
                toast.show();
                bg_Rect.setBackgroundColor(Color.rgb(255,0,0));
                msg.setText("Changed to Color Red");
                break;
            case R.id.blueBtn:
                toast = Toast.makeText(this, "Clicked Blue Button!", Toast.LENGTH_SHORT);
                toast.show();
                bg_Rect.setBackgroundColor(Color.rgb(0,0,255));
                msg.setText("Changed to Color Blue ");
                break;
            case R.id.greenBtn:
                toast = Toast.makeText(this, "Clicked Green Button!", Toast.LENGTH_SHORT);
                toast.show();
                bg_Rect.setBackgroundColor(Color.rgb(0,255,0));
                msg.setText("Changed to Color Green ");
                break;
            case R.id.clearBtn:
                toast = Toast.makeText(this, "Cleared Background Color!", Toast.LENGTH_SHORT);
                toast.show();
                bg_Rect.setBackgroundColor(Color.rgb(255,255,255));
                msg.setText("Select Background Color");
                break;
        }
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        this.finish();
    }
}
