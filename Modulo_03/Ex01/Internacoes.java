package Java_B3.Modulo_03.Ex01;

import java.util.Objects;

public class Internacoes {

    private Cachorro[] cachorrosInternados = new Cachorro[10];

    public void internar(Cachorro cachorro){
        for (int i = 0; i < cachorrosInternados.length; i++) {
            if(Objects.isNull(cachorrosInternados[i])){
                cachorrosInternados[i] = cachorro;
                break;
            }
        }
    }

    public void mostraCachorrosInternados() {
        System.out.println("-----------------DOGUINHOS DOENTES--------------------");
        for (Cachorro cachorro: cachorrosInternados) {
            if (Objects.nonNull(cachorro)) {
                System.out.println(cachorro);
            }
        }
    }
}