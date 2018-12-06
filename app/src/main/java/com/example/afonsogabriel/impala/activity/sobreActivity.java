package com.example.afonsogabriel.impala.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.afonsogabriel.impala.R;

import mehdi.sakout.aboutpage.AboutPage;

public class sobreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sobre);


        View sobre = new AboutPage(this)


                .setImage(R.drawable.logo_principal)
                .addGroup("Contato")
                .addEmail("reinoimpalacafeteria@gmail.com")
                .addTwitter("ICafeteria")
               .addInstagram("impalacafeteria")
                .create();

        setContentView(sobre);
    }
}
