package com.moksh.gamesense;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.moksh.gamesense.ui.News.ModelClass;
import com.moksh.gamesense.ui.Videos.VideoModelClass;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class SplashActivity extends AppCompatActivity {
    private static final long SPLASH_DISPLAY = 1000;
    public static ArrayList<ModelClass> modelClassesList = new ArrayList<>();
    public static ArrayList<VideoModelClass> videoModelClasses = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);



        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference().child("News");
        DatabaseReference myVideoRef = database.getReference().child("Videos");

//        for news section
//        myRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
//                modelClassesList.clear();
//                for (DataSnapshot dataSnapshot: snapshot.getChildren()){
//                    ModelClass modelClass = new ModelClass(dataSnapshot.child("headline").getValue(String.class),dataSnapshot.child("image").getValue(String.class),dataSnapshot.child("url").getValue(String.class));
//                    modelClassesList.add(modelClass);
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull @NotNull DatabaseError error) {
//            }
//        });

//          for video section
        myVideoRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                videoModelClasses.clear();
                for (DataSnapshot dataSnapshot: snapshot.getChildren()){
                    VideoModelClass videoModelClass = new VideoModelClass(dataSnapshot.child("url").getValue(String.class),dataSnapshot.child("title").getValue(String.class));
                    videoModelClasses.add(videoModelClass);
                }
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {
                Toast.makeText(SplashActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                Intent noInternet = new Intent(SplashActivity.this,NoInternet.class);
                if(InternetConnected(getBaseContext()))
                {
                    SplashActivity.this.startActivity(intent);
                }
                else
                {
                    SplashActivity.this.startActivity(noInternet);
                }
                SplashActivity.this.finish();
            }
        },SPLASH_DISPLAY);
    }
    public boolean InternetConnected(Context context) {
        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            connected = true;
        } else {
            connected = false;
        }
        return connected;
    }
}