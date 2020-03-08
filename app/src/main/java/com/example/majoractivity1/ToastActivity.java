package com.example.majoractivity1;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);



        LinearLayout blueLayout = findViewById(R.id.blue);
        blueLayout.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View v){
                CharSequence blueText = "Hello from blue layout!";
                Toast toast = Toast.makeText(getApplicationContext(), blueText, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_VERTICAL,0,0);
                toast.show();



            }
        });
        LinearLayout redLayout = findViewById(R.id.red);
        redLayout.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View v){
                CharSequence redText = "Hello from red layout!";
                Toast toast = Toast.makeText(getApplicationContext(), redText, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_VERTICAL,0,0);
                toast.show();



            }
        });
        LinearLayout greenLayout = (LinearLayout)
                findViewById(R.id.green);
        greenLayout.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View v){
                CharSequence greenText = "Hello from green layout!";
                Toast toast = Toast.makeText(getApplicationContext(), greenText, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_VERTICAL,0,0);
                toast.show();



            }
        });
        LinearLayout pinkLayout = findViewById(R.id.pink);
        pinkLayout.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View v){
                CharSequence pinkText = "Hello from pink layout!";
                Toast toast = Toast.makeText(getApplicationContext(), pinkText, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_VERTICAL,0,0);
                toast.show();



            }
        });
        LinearLayout yellowLayout = (LinearLayout)
                findViewById(R.id.yellow);
        yellowLayout.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View v){
                CharSequence yellowText = "Hello from yellow layout!";
                Toast toast = Toast.makeText(getApplicationContext(), yellowText, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_VERTICAL,0,0);
                toast.show();



            }
        });
        LinearLayout blackLayout = findViewById(R.id.black);
        blackLayout.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View v){
                CharSequence blackText = "Hello from black layout!";
                Toast toast = Toast.makeText(getApplicationContext(), blackText, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_VERTICAL,0,0);
                toast.show();



            }
        });

        LinearLayout orangeLayout = findViewById(R.id.orange);
        orangeLayout.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View v){
                CharSequence orangeText = "Hello from orange layout!";
                Toast toast = Toast.makeText(getApplicationContext(), orangeText, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_VERTICAL,0,0);
                toast.show();



            }
        });
        LinearLayout brownLayout = findViewById(R.id.brown);
        brownLayout.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View v){
                CharSequence brownText = "Hello from brown layout!";
                Toast toast = Toast.makeText(getApplicationContext(), brownText, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_VERTICAL,0,0);
                toast.show();



            }
        });
        LinearLayout purpleLayout = findViewById(R.id.purple);
        purpleLayout.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View v){
                CharSequence purpleText = "Hello from purple layout!";
                Toast toast = Toast.makeText(getApplicationContext(), purpleText, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_VERTICAL,0,0);
                toast.show();



            }
        });






    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        this.finish();
    }


}
