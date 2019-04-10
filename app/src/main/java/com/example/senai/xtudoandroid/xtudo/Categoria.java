package com.example.senai.xtudoandroid.xtudo;

public class Categoria
{
    private int id;
    private String nome;
    private int descricao;
    private String linkFoto;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getDescricao()
    {
        return descricao;
    }

    public void setDescricao(int descricao)
    {
        this.descricao = descricao;
    }

    public String getLinkFoto()
    {
        return linkFoto;
    }

    public void setLinkFoto(String linkFoto)
    {
        this.linkFoto = linkFoto;
    }
}
