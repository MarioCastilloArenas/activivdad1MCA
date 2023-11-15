package com.example.activivad1mca;

import androidx.appcompat.app.AppCompatActivity;
import android.view.animation.Animation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    TextView textBounce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.goup);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.godown);

        TextView textViewPower = findViewById(R.id.textView);
        TextView textViewName = findViewById(R.id.name);
        ImageView imageLogo = findViewById(R.id.logoIntel);


        textViewPower.setAnimation(animation2);
        textViewName.setAnimation(animation2);
        imageLogo.setAnimation(animation1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
        //openLogin();



    }

    //public void openLogin(){

      //  new Handler(Looper.getMainLooper()).postDelayed(new Runnable(){

//            @Override
  //          public void run(){
    //            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
      //          intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
          //      startActivity(intent);
            //}

        //},3000);
    }
