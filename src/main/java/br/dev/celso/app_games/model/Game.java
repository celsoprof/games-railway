package br.dev.celso.app_games.model;

public class Game {

    private int id;
    private String titulo;
    private String produtora;
    private double preco;

    public Game(int id, String titulo, String produtora, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.produtora = produtora;
        this.preco = preco;
    }

    public Game(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
