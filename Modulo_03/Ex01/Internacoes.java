package Java_B3.Modulo_03.Ex01;

import Ex01.Cachorro;

import java.util.Objects;

public class Internacoes {

    private Ex01.Cachorro[] cachorrosInternados = new Ex01.Cachorro[10];

    public void internar(Ex01.Cachorro cachorro){
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