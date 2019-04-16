package com.example.senai.xtudoandroid.xtudo;

public class EmpresaCliente extends Empresa
{
    private Pedido pedido;

    public EmpresaCliente(int id, String nome, String nomeFantasia, String cnpj, AvaliacaoGeral ag, String linkFoto, Pedido pedido)
    {
        super(id, nome, nomeFantasia, cnpj, ag, linkFoto);
        this.pedido = pedido;
    }

    public boolean realizarCadastro()
    {

        return true;
    }

    public Produto consultar(String nome)
    {
        return null;
    }

    public boolean comprar(Produto p)
    {
        return true;
    }

    public boolean terminar()
    {
        return true;
    }

    public boolean pagar()
    {
        return true;
    }

    public Pedido obterStatusPedido()
    {
        return null;
    }

    public boolean enviarMensagem(String msg)
    {
        return true;
    }

    public boolean aceitarEntrega(boolean aceite)
    {
        return true;
    }

    public boolean cancelarPedido()
    {
        return true;
    }
}
