package Java_B3.Modulo_04.Aula_Revision;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contato> listaContatos = new ArrayList<>();

        Contato contato1 = new Contato(1, "Maria", "(00) 55555-5555", LocalDate.parse("2000-12-30"));
        Contato contato2 = new Contato(2, "João", "(00) 55555-5555", LocalDate.parse("1964-12-03"));
        Contato contato3 = new Contato(3, "José", "(00) 55555-5555", LocalDate.parse("1988-06-30"));
        Contato contato4 = new Contato(4, "Ana", "(00) 55555-5555", LocalDate.parse("2005-01-02"));

        listaContatos.add(contato1);
        listaContatos.add(contato2);
        listaContatos.add(contato3);
        listaContatos.add(contato4);

        System.out.println("\nSomatório das idades: " +
                listaContatos.stream().reduce(0, (total, idade) -> total + idade.getIdade(), Integer::sum));

        var menor = listaContatos.stream().min(Comparator.comparingInt(Contato::getIdade)).get();
        System.out.println("\nPessoa mais nova é " + menor.getNome() +
                " com " + menor.getIdade() + " anos");

        var maior = listaContatos.stream().max(Comparator.comparingInt(Contato::getIdade)).get();
        System.out.println("\nPessoa mais velha é " + maior.getNome() +
                " com " + maior.getIdade() + " anos");

        System.out.println("\n*** Pesquisa por nome ***");
        listaContatos.stream().filter(data -> data.getNome().equals("Maria")).forEach(System.out::println);

        System.out.println("\n*** Pesquisa por ID ***");
        listaContatos.stream().filter(data -> data.getId() == 3).forEach(System.out::println);

        System.out.println("\n*** Filtro por Data de Nascimento ***");
        listaContatos.stream().filter(data -> data.getDataNascimento().
                isEqual(LocalDate.parse("1964-12-03"))).forEach(System.out::println);

        System.out.println("\n*** Lista em ordem alfabética ***");
        listaContatos.stream().sorted(Comparator.comparing(Contato::getNome)).forEach(System.out::println);
    }
}


