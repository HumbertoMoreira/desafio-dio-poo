import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso python");
        curso2.setDescricao("Descrição do curso python");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHumberto = new Dev();
        devHumberto.setNome("Humberto");
        devHumberto.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Humberto: " + devHumberto.getConteudoIncritos());
        devHumberto.progredir();
        devHumberto.progredir();
        devHumberto.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Humberto: " + devHumberto.getConteudoIncritos());
        System.out.println("Conteúdos concluidos Humberto: " + devHumberto.getConteudoConcluido());
        System.out.println("Xp: " + devHumberto.calcularTotalXp());

        System.out.println("-----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudoIncritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudoIncritos());
        System.out.println("Conteúdos concluidos João: " + devJoao.getConteudoConcluido());
        System.out.println("Xp: " + devJoao.calcularTotalXp());
    }
}