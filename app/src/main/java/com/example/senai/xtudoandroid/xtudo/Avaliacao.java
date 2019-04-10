package com.example.senai.xtudoandroid.xtudo;

public class Avaliacao {
    private static final int  NOTA_0 = 0;
    private static final int  NOTA_1 = 1;
    private static final int  NOTA_2 = 2;
    private static final int  NOTA_3 = 3;
    private static final int  NOTA_4 = 4;
    private static final int  NOTA_5 = 5;
    private Empresa ator;
    private Empresa avaliacao;
    private int valorQuantidade;
    private int valorPreco;
    private int valorTempo;
    private String comentario;

    public Empresa getAtor() {
        return ator;
    }

    public void setAtor(Empresa ator) {
        this.ator = ator;
    }

    public Empresa getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Empresa avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getValorQuantidade() {
        return valorQuantidade;
    }

    public void setValorQuantidade(int valorQuantidade) {
        this.valorQuantidade = valorQuantidade;
    }

    public int getValorPreco() {
        return valorPreco;
    }

    public void setValorPreco(int valorPreco) {
        this.valorPreco = valorPreco;
    }

    public int getValorTempo() {
        return valorTempo;
    }

    public void setValorTempo(int valorTempo) {
        this.valorTempo = valorTempo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
