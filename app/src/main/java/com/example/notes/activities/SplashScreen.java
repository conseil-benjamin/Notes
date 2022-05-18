package com.example.notes.activities;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.notes.R;

public class SplashScreen  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

    Runnable runnable = new Runnable() {

        @Override
        public void run() {
            //démarrer une page
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    };

    // handler post delayed
        new Handler().postDelayed(runnable, 3000);
 }
}
