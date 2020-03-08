package com.example.majoractivity1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText  userName, passWord;
    Button loginBTN;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText)findViewById(R.id.username);
        passWord = (EditText)findViewById(R.id.password);
        loginBTN = (Button) findViewById(R.id.loginBtn);

        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userName.getText().toString().equals("admin") && passWord.getText().toString().equals("admin1234")) {
                    toast = Toast.makeText(LoginActivity.this, "Login Success!", Toast.LENGTH_SHORT);
                    toast.show();
                    userName.setText("");
                    passWord.setText("");
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    userName.setText("");
                    passWord.setText("");
                    toast = Toast.makeText(LoginActivity.this, "Incorrect Username/Password", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
