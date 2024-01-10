package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent intent = getIntent();
        String email = intent.getStringExtra("mail");
        String pass = intent.getStringExtra("pass");

        TextView emailView = findViewById(R.id.email);
        emailView.setText(email);

        TextView passwordView = findViewById(R.id.password);
        passwordView.setText(pass);
    }
}