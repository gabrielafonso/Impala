package com.example.afonsogabriel.impala.activity;

public class Produtos {
    private String titulo;
    private int imagem;

    public Produtos() {
    }

    public Produtos(String titulo, int imagem) {
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
