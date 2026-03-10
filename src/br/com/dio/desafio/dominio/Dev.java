package br.com.dio.desafio.dominio;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
     private String nome;
     private  Set<Conteudo> conteudosIndcritos = new LinkedHashSet<>();
     private  Set<Conteudo> conteudosConcluidos  = new LinkedHashSet<>();

     public void inscreverBootcamp (Bootcamp bootcamp){
         this.conteudosIndcritos.addAll(bootcamp.getConteudos());
         bootcamp.getDevInscritos().add(this);

     }
     public void progredir() {
         Optional<Conteudo> conteudo = this.conteudosIndcritos.stream().findFirst();
         if (conteudo.isPresent()){
             this.conteudosConcluidos.add(conteudo.get());
             this.conteudosIndcritos.remove(conteudo.get());


         }else {
             System.err.println("Ops..Você não está matriculado em nenhum conteúdo!");
         }

     }
     public double calcularTotalXp() {
         double sum = this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
         return sum;
     }

    public Set<Conteudo> getConteudosIndcritos() {
        return conteudosIndcritos;
    }

    public void setConteudosIndcritos(Set<Conteudo> conteudosIndcritos) {
        this.conteudosIndcritos = conteudosIndcritos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIndcritos, dev.conteudosIndcritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIndcritos, conteudosConcluidos);
    }
}
