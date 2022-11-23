package Java_B3.Modulo_03.Ex01;

import Ex01.Cachorro;

import java.util.Objects;

public class CadastroCachorro {
    Ex01.Cachorro[] listaCachorros = new Ex01.Cachorro[1];

    public void listar(Ex01.Cachorro cachorro) {
        if (Ex01.Cachorro.getContador() == 1) {
            listaCachorros[0] = cachorro;
        }
        else {
            Ex01.Cachorro[] listaCachorrosTemp = new Ex01.Cachorro[Ex01.Cachorro.getContador()];
            for(int i = 0; i < listaCachorros.length; i++) {
                listaCachorrosTemp[i] = listaCachorros[i];
            }
            listaCachorrosTemp[Ex01.Cachorro.getContador() - 1] = cachorro;
            listaCachorros = new Ex01.Cachorro[Ex01.Cachorro.getContador()];
            for (int i = 0; i < listaCachorros.length; i++) {
                listaCachorros[i] = listaCachorrosTemp[i];
            }
        }
    }
        public void mostraListaCachorros () {
            System.out.println("\n-----------------LISTA DE DOGUINHOS--------------------");
            for (Cachorro cachorro : listaCachorros) {
                if (Objects.nonNull(cachorro)) {
                    System.out.println(cachorro);
                }
            }
        }
}
