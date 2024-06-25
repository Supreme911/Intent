package com.example.intent;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomePage extends AppCompatActivity {
    TextView email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home_page);
        email = findViewById(R.id.email_display);
        password=findViewById(R.id.password_display);

        Intent intent = getIntent();
        String email_in=intent.getStringExtra("email");
        String password_in=intent.getStringExtra("password");

        email.setText(email_in);
        password.setText(password_in);

    }

}