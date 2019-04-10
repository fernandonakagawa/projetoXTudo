package com.example.senai.xtudoandroid.xtudo;

public abstract class Empresa {
    private int id;
    private String nome;
    private String nomeFantasia;
    private String cnpj;
    AvaliacaoGeral ag;
    String linkFoto;

    public Empresa(int id,
                   String nome,
                   String nomeFantasia,
                   String cnpj,
                   AvaliacaoGeral ag,
                   String linkFoto) {
        this.id = id;
        this.nome = nome;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.ag = ag;
        this.linkFoto = linkFoto;
    }
}
