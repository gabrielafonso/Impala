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
                .addEmail("impalacafeteria@gmail.com")
               // .addWebsite("http://www.mcdonalds.com.br/")
               // .addGroup("Redes Socias")
                //.addFacebook("McDonaldsBrasil")
               // .addTwitter("McDonalds_BR")
               // .addInstagram("mcdonalds_br")
                .create();

        setContentView(sobre);
    }
}
