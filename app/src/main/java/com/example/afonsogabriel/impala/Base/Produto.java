package com.example.afonsogabriel.impala.Base;

public class Produto {

    private String titulo;
    private int imagem;

    public Produto(){

    }

    public Produto(String titulo, int imagem){
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
