package com.example.afonsogabriel.impala.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.afonsogabriel.impala.R;

public class ProdutosActivity extends AppCompatActivity {

    private TextView tTitulo;
    private ImageView mImagem;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        tTitulo = findViewById(R.id.textTitulo);
        mImagem = findViewById(R.id.okImagem);

        Intent intent = getIntent();
        String textoTitulo = intent.getExtras().getString("Doces");
        int okImagem = intent.getExtras().getInt("");

        //atribuindo valores

        tTitulo.setText(textoTitulo);
        mImagem.setImageResource(okImagem);


}
}
