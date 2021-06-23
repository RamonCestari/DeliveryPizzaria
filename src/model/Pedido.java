package model;

public class Pedido {

    private String seuPedido;
    private String nome;
    private String telefone;
    private String endereco;

    public String getSeuPedido() {
        return seuPedido;
    }

    public void setSeuPedido(String seuPedido) {
        this.seuPedido = seuPedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
