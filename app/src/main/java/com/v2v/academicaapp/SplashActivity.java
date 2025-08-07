package com.v2v.academicaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Apply animations
        ImageView logo = findViewById(R.id.logoImage);
        TextView appName = findViewById(R.id.appName);
        TextView appQuote = findViewById(R.id.thoughtText);

        Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);

        logo.startAnimation(slideUp);
        appName.startAnimation(slideUp);
        appQuote.startAnimation(slideUp);

        // Splash delay then open RegisterActivity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, RegisterActivity.class);
            startActivity(intent);
            finish(); // Close splash so user can’t go back to it
        }, 3000); // 3 seconds
    }
}