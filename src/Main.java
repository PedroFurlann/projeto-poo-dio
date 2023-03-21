import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setDescricao("Descrição curso java");
        curso1.setTitulo("Curso Poo Java");
        curso1.setCargaHoraria(1);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setDescricao("Descrição curso javascript");
        curso2.setTitulo("Curso Javascript");
        curso2.setCargaHoraria(10);

        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setDescricao("Descrição mentoria");
        mentoria1.setTitulo("Título mentoria");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
