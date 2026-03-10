package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    // implementar o calcular XP nas classes filhas (HERANÇA)
    // abstract - não é possivel instanciar em outras classes
    //mentoria /cursos
    //atributos- XP PADRÃO
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
