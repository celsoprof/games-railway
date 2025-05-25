package br.dev.celso.app_games.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String produtora;
    private double preco;
    private String imageUrl;

    public Game(Long id, String titulo, String produtora, double preco, String imageUrl) {
        this.id = id;
        this.titulo = titulo;
        this.produtora = produtora;
        this.preco = preco;
        this.imageUrl = imageUrl;
    }

    public Game(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getImageUrl() {
        return imageUrl;
    }
}
