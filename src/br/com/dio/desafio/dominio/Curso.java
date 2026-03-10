package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    //atributos - titulo/descrição/cargaHoraria/
    //métodos - calcularXp

    private int CargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * CargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }


}
