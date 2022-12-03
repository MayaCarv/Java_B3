package Java_B3.Modulo_04.Aula_Stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AulaSteam {
    public static void main(String[] args) {
//        Stream<Integer> listaSteam = Stream.iterate(0, i-> i+4);
//        listaSteam.forEach(System.out::println);
//        listaSteam.forEach(System.out::println);

//        Stream<Integer> listaInteiros = Stream.of(1,null, 8);
//        System.out.println(listaInteiros.count());
//        System.out.println(listaInteiros.min(Comparator.naturalOrder()));
//        System.out.println(listaInteiros.max(Comparator.naturalOrder()));

//        Optional<Integer> optional = listaInteiros.findAny();
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//            System.out.println(optional.get());
//            System.out.println(optional.get());
//        }

        Stream<String> listaStrings = Stream.of("azeitona", "arroz" , "abacate");
        //Predicate<String> predicate = item -> item.length() > 5;
        System.out.println(listaStrings.anyMatch(item -> item.length() > 5));

    }
}
