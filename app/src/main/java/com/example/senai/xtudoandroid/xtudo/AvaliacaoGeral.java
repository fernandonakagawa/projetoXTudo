package com.example.senai.xtudoandroid.xtudo;

public class AvaliacaoGeral {
    private int aAvaliacao ;
    private float notaMediaQualidade;
    private float notaMediaPreco;
    private float notaMediaTempo;
    public boolean adicionarAvaliacao;

public AvaliacaoGeral(int aAvaliacao,float notaMediaQualidade,float notaMediaPreco,
                      float notaMediaTempo,boolean adicionarAvaliacao){
    this.aAvaliacao = aAvaliacao;
    this.notaMediaQualidade = notaMediaQualidade;
    this.notaMediaPreco = notaMediaPreco;
    this.notaMediaTempo = notaMediaTempo;
    this.adicionarAvaliacao = adicionarAvaliacao;
}
}

