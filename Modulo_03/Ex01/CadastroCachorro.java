package Ex01;

import java.util.Objects;

public class CadastroCachorro {
    Cachorro[] listaCachorros = new Cachorro[1];

    public void listar(Cachorro cachorro) {
        if (Cachorro.getContador() == 1) {
            listaCachorros[0] = cachorro;
        }
        else {
            Cachorro[] listaCachorrosTemp = new Cachorro[Cachorro.getContador()];
            for(int i = 0; i < listaCachorros.length; i++) {
                listaCachorrosTemp[i] = listaCachorros[i];
            }
            listaCachorrosTemp[Cachorro.getContador() - 1] = cachorro;
            listaCachorros = new Cachorro[Cachorro.getContador()];
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
