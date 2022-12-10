package Java_B3.Modulo_04.Aula_revisão;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Contato> listaContatos = new ArrayList<>();

//        Some todas as idades
//    Filtre por data de nascimento
//    Pesquise por nome ou id
//    Ordene por nome
//    Mostre a pessoa mais velha e mais nova

        Contato contato1 = new Contato(1, "Maria", "(00) 55555-5555", LocalDate.parse("05-12-2000"));
        Contato contato2 = new Contato(2, "João", "(00) 55555-5555", LocalDate.parse("12-03-1978"));
        Contato contato3 = new Contato(3, "José", "(00) 55555-5555", LocalDate.parse("06-30-1988"));
        Contato contato4 = new Contato(4, "Ana", "(00) 55555-5555", LocalDate.parse("01-02-2005"));

        listaContatos.add(contato1);
        listaContatos.add(contato2);
        listaContatos.add(contato3);
        listaContatos.add(contato4);

        Stream<Contato> contatoStream = listaContatos.stream();

        contatoStream.reduce(0, (total, idade) -> total + idade.getIdade(), Integer::sum);
    }
}
