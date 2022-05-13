package com.cub.cse;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
     SliderView sliderView;
     int[] images = {R.drawable.one,
     R.drawable.two,R.drawable.three,R.drawable.four
     ,R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten};
     ImageView cse,bba,eee,english,fnt,law,sms;
     ImageView admission,admissInfo,contact,UMS;
     ImageView techerSche,courses,creditTrans,codeOfconduct,payFee,EntryReq,sexual,internStu,scholar;
    StorageReference storageReference;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // storageReference = FirebaseStorage.getInstance().getReference();
       // progressDialog = new ProgressDialog(MainActivity.this);

       // progressDialog.setTitle("Loading Data");
       // progressDialog.setTitle("Please Wait");
       // progressDialog.setCanceledOnTouchOutside(false);
        //progressDialog.show();
        cse = findViewById(R.id.imageView6);
        bba = findViewById(R.id.imageView7);
        eee = findViewById(R.id.imageView8);
        english = findViewById(R.id.imageView9);
        fnt = findViewById(R.id.imageView11);
        law = findViewById(R.id.imageView12);
        sms = findViewById(R.id.imageView13);

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,CSEWEBActivity.class);
                startActivity(intent);
            }
        });
        bba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,BBAWEBActivity.class);
                startActivity(intent);
            }
        });
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,EEEWEBActivity.class);
                startActivity(intent);
            }
        });
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,EnglishWEBActivity.class);
                startActivity(intent);
            }
        });
        fnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,FntWEBActivity.class);
                startActivity(intent);
            }
        });
        law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,LAWWEBActivity.class);
                startActivity(intent);

            }
        });
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,SMSWEBActivity.class);
                startActivity(intent);
            }
        });

        admission=findViewById(R.id.imageView17);
        admissInfo=findViewById(R.id.imageView18);
        contact = findViewById(R.id.imageView19);
        UMS = findViewById(R.id.imageView27);

        admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,admissionFORMActivity.class);
                startActivity(intent);
            }
        });
        admissInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,AdmissionActivity.class);
                startActivity(intent);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,AdmissionActivity.class);
                startActivity(intent);
            }
        });
        UMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,UMSWEBActivity.class);
                startActivity(intent);
            }
        });

        techerSche= findViewById(R.id.imageView29);
        courses = findViewById(R.id.imageView20);
        creditTrans = findViewById(R.id.imageView21);
        codeOfconduct = findViewById(R.id.imageView22);
        payFee=findViewById(R.id.imageView23);
        EntryReq = findViewById(R.id.imageView24);
        sexual = findViewById(R.id.imageView25);
        internStu = findViewById(R.id.imageView26);
        scholar= findViewById(R.id.imageView28);

        techerSche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        creditTrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        codeOfconduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        payFee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        EntryReq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        sexual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,SexualActivity.class);
                startActivity(intent);
            }
        });
        internStu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        scholar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        sliderView = findViewById(R.id.image_slider);
        SliderAdapter sliderAdapter = new SliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        MaterialToolbar toolbar = findViewById(R.id.topAppBar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawerLayout.openDrawer(GravityCompat.START);

            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (id)
                {

                    case R.id.nav_home:
                        Intent intent4 = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent4);
                        break;



                    case R.id.nav_messenger:
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://messaging/720416484761822"));
                        startActivity(intent);   //https://www.facebook.com/EWU.ECPA          //m.me/1558872227740979
                        break;
                    case R.id.nav_facebook:
                        Intent intent11 = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/720416484761822"));
                        startActivity(intent11);
                        break;
                    case R.id.nav_cs:
                        String mobCall2 = "tel:+8801406302375";
                        Intent intent12 = new Intent(Intent.ACTION_DIAL);
                        intent12.setData(Uri.parse(mobCall2));
                        startActivity(intent12);
                        break;
                    case R.id.nav_web:
                        Intent intent13 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cub.edu.bd/cub/index.php"));
                        startActivity(intent13);

                        break;
                    case R.id.nav_email:


                        final Intent emailIntent = new Intent(Intent.ACTION_SEND);

                        /* Fill it with Data */
                        emailIntent.setType("plain/text");
                        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@cub.edu.bd"});
                        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                        emailIntent.putExtra(Intent.EXTRA_TEXT, "Text");

                        /* Send it off to the Activity-Chooser */
                        startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                        break;
                    case R.id.store:
                        Intent intent16 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/HfFXuPoAHpoECcmPA"));
                        startActivity(intent16);

                        break;
                    case R.id.About:
                        Toast.makeText(MainActivity.this, "About Content Needed",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_Instragram:
                        Intent intent160 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cub.edu.bd/"));
                        startActivity(intent160);

                        break;
                    case R.id.nav_Twitter:
                        Intent intent15 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/cub_edu_bd?"));
                        startActivity(intent15);
                        break;
                    case R.id.nav_whatsapp:
                        String number="+8801783655639";
                        String url = "https://api.whatsapp.com/send?phone="+number;
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;
                    case R.id.nav_youtube:
                        Intent intent17 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCiGFY7uS7tnmewIIvgHRLZw"));
                        startActivity(intent17);
                        break;
                    default:
                        return true;

                }
                return true;
            }
        });
    }

}