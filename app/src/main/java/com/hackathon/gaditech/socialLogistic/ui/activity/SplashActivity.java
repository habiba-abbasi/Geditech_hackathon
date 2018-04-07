package com.hackathon.gaditech.socialLogistic.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hackathon.gaditech.socialLogistic.R;
import com.hackathon.gaditech.socialLogistic.databinding.ActivitySplashBinding;

public class SplashActivity extends Activity {

    ActivitySplashBinding binding;
    public static  int SPLASH_TIME_OUT=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_splash);
        // calligrapher =new Calligrapher(this);
        //calligrapher.setFont(this,"Roboto-Thin.ttf",true);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(intent);

                //close the activity
                finish();
            }

        },SPLASH_TIME_OUT);
    }
}
