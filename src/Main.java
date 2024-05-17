import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("curso java", "descrição curso java", 8);
        Conteudo curso2 = new Curso("curso js","descrição curso js",4);

        Conteudo mentoria = new Mentoria("mentoria de java", "descrição mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.imprimeConteudosInscritos();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        devCamila.imprimeConteudosInscritos();
        devCamila.imprimeConteudosInscritos();
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.imprimeConteudosInscritos();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        devJoao.imprimeConteudosInscritos();
        devJoao.imprimeConteudosInscritos();
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }

}
