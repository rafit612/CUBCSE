package com.cub.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class WelcomeActivity2 extends AppCompatActivity {
    VideoView vv;
    private static int TIME=3000;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);
        vv = (VideoView)findViewById(R.id.videoView);
    }
    protected void onStart(){
        super.onStart();



        //Video Loop
        vv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                vv.start(); //need to make transition seamless.
            }
        });

        Uri uri = Uri.parse("android.resource://com.cub.cse/"
                +R.raw.cubvideo);

        vv.setVideoURI(uri);
        vv.requestFocus();
        vv.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                firebaseAuth = FirebaseAuth.getInstance();
                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                if(firebaseUser!=null){
                    Intent intent =new Intent(WelcomeActivity2.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else{

                }
                Intent intent =new Intent(WelcomeActivity2.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },TIME);

    }
}