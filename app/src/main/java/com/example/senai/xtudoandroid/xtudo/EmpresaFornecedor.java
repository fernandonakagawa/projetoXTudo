package com.example.senai.xtudoandroid.xtudo;

import java.util.ArrayList;

public class EmpresaFornecedor extends Empresa
{
    ArrayList<Pedido> aPedidos;

    public EmpresaFornecedor(int id, String nome, String nomeFantasia, String cnpj, AvaliacaoGeral ag, String linkFoto, ArrayList<Pedido> aPedidos)
    {
        super(id, nome, nomeFantasia, cnpj, ag, linkFoto);
        this.aPedidos = aPedidos;
    }

    public boolean aceitarPedido(boolean aceite, Pedido p)
    {
        return true;
    }

    public boolean cancelarEntrega(Pedido p)
    {
        return true;
    }

    public boolean entregar(Pedido p)
    {
        return true;
    }

    public boolean cadastrarProduto(Pedido p)
    {
        return true;
    }

    public boolean removerProduto(Pedido p)
    {
        return true;
    }

    public ArrayList<Produto> listarProdutos()
    {
        return null;
    }

    public boolean alterarProdutos(Pedido p)
    {
        return true;
    }
}
