import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        //o new instancia
        // o Curso é a plata e o curso1 a casa construida
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //Conteudo conteudo = new Curso (); - seria um  polimofisrmo  td q tivesse em conteudo teria em curso


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new  Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devThami = new Dev();
        devThami.setNome("Thamires");
        devThami.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Thamires" + devThami.getConteudosIndcritos());
        devThami.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Thamires" + devThami.getConteudosIndcritos());
        System.out.println("Conteudos Concluidos Thamires" + devThami.getConteudosConcluidos());
        System.out.println("XP:" + devThami.calcularTotalXp());

        System.out.println("----------");

        Dev devGab = new Dev();
        devGab.setNome("Gabriel");
        devGab.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Gabriel" + devGab.getConteudosIndcritos());
        devGab.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Gabriel" + devGab.getConteudosIndcritos());
        System.out.println("Conteudos Concluidos Gabriel" + devGab.getConteudosConcluidos());
        System.out.println("XP:" + devGab.calcularTotalXp());




    }
}
