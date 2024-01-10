package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnClick(View v){
        Button btn = findViewById(R.id.btnLogin);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);

        String mail = email.getText().toString();
        String pass = password.getText().toString();

        Intent intent = new Intent(this, NewActivity.class);
        intent.putExtra("mail", mail);
        intent.putExtra("pass", pass);
        startActivity(intent);
    }
}