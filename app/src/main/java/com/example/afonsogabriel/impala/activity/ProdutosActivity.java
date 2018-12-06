package com.example.afonsogabriel.impala.activity;

import android.support.v7.app.AppCompatActivity;

public class ProdutosActivity extends AppCompatActivity {
    private String titulo;
    private int imagem;

    public ProdutosActivity() {
    }

    public ProdutosActivity(String titulo, int imagem) {
        this.titulo = titulo;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
