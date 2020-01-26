package winarwahyuw.winw.daftarbelanja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import winarwahyuw.winw.daftarbelanja.R;

public class SplashActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent MainActivity= new Intent(SplashActivity.this, MainActivity.class);
                startActivity(MainActivity);
                finish();
            }
        },waktu_loading);
    }
}
