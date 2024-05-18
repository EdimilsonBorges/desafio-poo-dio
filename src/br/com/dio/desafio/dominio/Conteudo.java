package br.com.dio.desafio.dominio;

public abstract class Conteudo implements Iconteudo{

    private String titulo;
    private String descricao;

    public Conteudo(String titulo,  String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }

}
