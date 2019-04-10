package com.example.senai.xtudoandroid.xtudo;

public class Produto {
    private int id;
    private String nome;
    Categoria categoria;
    private String linkFoto;

    public Produto(int id,
                   String nome,
                   Categoria categoria,
                   String linkFoto) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.linkFoto = linkFoto;
    }
}
