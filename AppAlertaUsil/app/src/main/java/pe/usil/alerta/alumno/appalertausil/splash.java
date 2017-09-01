package pe.usil.alerta.alumno.appalertausil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void onStart(){
        super.onStart();
        new Timer().schedule(new TimerTask(){
        public void run(){
            //intent para realizar un trabajo especifico
            Intent intent = new Intent(splash.this, login.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        }
    },8000);
    }
  }

