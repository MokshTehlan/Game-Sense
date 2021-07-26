package com.moksh.gamesense.ui.Maps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.moksh.gamesense.R;

import org.jetbrains.annotations.NotNull;

public class ErangleMap extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
//    SubsamplingScaleImageView erangleMap;
//    SubsamplingScaleImageView erangleMap;
//    FirebaseStorage firebaseStorage;
//    StorageReference storageReference;
    TextView download;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.erangle_map);

        //layout inflater for toolbar
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.toolbar,null);
        TextView tv = (TextView) view.findViewById(R.id.toolbar_name);
        tv.setText("Erangle Map");
        ImageView back = (ImageView) view.findViewById(R.id.back_button);

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }
        });

        //onclick listner for back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //adding view to toolbar
        LinearLayout toolbar_erangle = findViewById(R.id.toolbar_erangle);
        toolbar_erangle.addView(view);

//        Adding image
//        erangleMap = findViewById(R.id.erangle_map);
//        firebaseStorage = FirebaseStorage.getInstance();
//        storageReference = firebaseStorage.getReference();
//        download = findViewById(R.id.download_map);
//        download.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(ErangleMap.this, "downloading....", Toast.LENGTH_SHORT).show();
//                downloadMap();
//                download.setVisibility(View.INVISIBLE);
//            }
//        });

//        Drawable drawableMap = getResources().getDrawable(R.drawable.erangle_map);
//        Drawable drawableMapVehicle = getResources().getDrawable(R.drawable.erangle_vehicles);
//
//        Bitmap bitmap = ((BitmapDrawable) drawableMap).getBitmap();
//        Bitmap bitvehicle = ((BitmapDrawable) drawableMapVehicle).getBitmap();
//
//        Bitmap scaleBitmapMap = Bitmap.createScaledBitmap(bitmap,3000,3000,true);
////        Bitmap scaleBitmapVehicle = Bitmap.createScaledBitmap(bitvehicle,3000,3000,true);
//        Bitmap combineImages = overlay(scaleBitmapMap,bitvehicle);
//        erangleMap.setImageBitmap(combineImages);
//        erangleMap.setImageDrawable(getResources().getDrawable(R.drawable.layer));


    }

    @Override
    public void onBackPressed() {
        if (mInterstitialAd != null) {
            mInterstitialAd.show(ErangleMap.this);
        } else {
        }
        super.onBackPressed();
    }
//    public static Bitmap overlay(Bitmap bmp1, Bitmap bmp2)
//    {
//        try
//        {
//            Bitmap bmOverlay = Bitmap.createBitmap(bmp1.getWidth(),bmp1.getHeight(),bmp1.getConfig());
//            Canvas canvas = new Canvas(bmOverlay);
//            canvas.drawBitmap(bmp1,new Matrix(),null);
//            canvas.drawBitmap(bmp2,0,0,null);
//            return bmOverlay;
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//            return null;
//        }
//    }
//    public void downloadMap(){
//        StorageReference imageRef = storageReference.child("Maps/erangle_map.jpg");
//        int MAXBYTES = 11660280;
//        imageRef.getBytes(MAXBYTES).addOnSuccessListener(new OnSuccessListener<byte[]>() {
//            @Override
//            public void onSuccess(byte[] bytes) {
//                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes,0,bytes.length);
//                Glide.with(ErangleMap.this).load(bitmap).into(erangleMap);
//                erangleMap.setImage(ImageSource.bitmap(bitmap));
//            }
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull @NotNull Exception e) {
//                Toast.makeText(ErangleMap.this, "failed to download", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//    }
}


























