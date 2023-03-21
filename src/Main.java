import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setDescricao("Descrição curso java");
        curso1.setTitulo("Curso Poo Java");
        curso1.setCargaHoraria(1);

        Curso curso2 = new Curso();
        curso2.setDescricao("Descrição curso javascript");
        curso2.setTitulo("Curso Javascript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setDescricao("Descrição mentoria");
        mentoria1.setTitulo("Título mentoria");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();

        bootcamp1.setNome("Bootcamp Banco Pan Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev pedroDev = new Dev();
        pedroDev.setNome("Pedro");
        pedroDev.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos de " + pedroDev.getNome() + ": " + pedroDev.getConteudosInscritos());
        pedroDev.progredir();
        pedroDev.progredir();
        System.out.println("-----------------------------------");

        System.out.println("Conteúdos inscritos de " + pedroDev.getNome() + ": " + pedroDev.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + pedroDev.getNome() + ": " + pedroDev.getConteudosConcluidos());
        System.out.println("XP: " + pedroDev.calcularTotalXp());

        System.out.println("-----------------------------------");

        Dev victorDev = new Dev();
        victorDev.setNome("Victor");
        victorDev.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos de " + victorDev.getNome() + ": " + victorDev.getConteudosInscritos());
        victorDev.progredir();
        victorDev.progredir();
        System.out.println("-----------------------------------");

        System.out.println("Conteúdos inscritos de " + victorDev.getNome() + ": " + victorDev.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + victorDev.getNome() + ": " + victorDev.getConteudosConcluidos());
        System.out.println("XP: " + victorDev.calcularTotalXp());


    }
}
