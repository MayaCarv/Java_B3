package Java_B3.Modulo_04.Exs_Aula;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Jogo {
    private String time1;
    private String time2;
    private LocalDateTime data_hora;
    private int golsTime1;

    private int golsTime2;

    public Jogo(String time1, String time2,
                LocalDateTime data_hora,
                int golsTime1, int golsTime2) {
        this.time1 = time1;
        this.time2 = time2;
        this.data_hora = data_hora;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public LocalDateTime getData_hora() {
        return data_hora;
    }

    public void setData_hora(LocalDateTime data_hora) {
        this.data_hora = data_hora;
    }

    public int getGolsTime1() {
        return golsTime1;
    }

    public void setGolsTime1(int golsTime1) {
        this.golsTime1 = golsTime1;
    }

    public int getGolsTime2() {
        return golsTime2;
    }

    public void setGolsTime2(int golsTime2) {
        this.golsTime2 = golsTime2;
    }

    public int getTotalGols()
    {
        return getGolsTime1() + getGolsTime2();
    }

    DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");
    @Override
    public String toString() {
        return "\nData: " + data_hora.format(formatter) +
                "\n" + time1 + " " + golsTime1 +
                ":" + golsTime2 + " " + time2;
    }
}
class MinGols {
    public static void min(List<Jogo> listaJogos) {
        Stream<Jogo> streamJogos = listaJogos.stream();
        var value = streamJogos.min(
                Comparator.comparingInt(Jogo::getTotalGols));
        value.ifPresent(jogo -> System.out.printf(
                        "\nJogo com o menor número" +
                        "de gols: %s\n", jogo));

    }
}
class MaxGols {
    public static void max(List<Jogo> listaJogos) {
        Stream<Jogo> streamJogos = listaJogos.stream();
        var value = streamJogos.max(
                Comparator.comparingInt(Jogo::getTotalGols));
        value.ifPresent(jogo -> System.out.println(
                "\nJogo com o maior número de gols:" +
                        jogo + "\n"));
    }

}

class TotalGols {
    public static void total(List<Jogo> listaJogos) {
        Stream<Jogo> streamJogos = listaJogos.stream();
        System.out.println("Total de gols marcados" +
                "\nem todos os jogos: " +
                streamJogos.map(Jogo::getTotalGols)
                        .reduce(0, Integer::sum));
    }
}

public class Placar {
    public static void main(String[] args) {
        var data = LocalDateTime.of(2022, 12, 2, 0, 0, 0);
        Jogo jogo1 = new Jogo("Coreia do Sul",
                "Portugal", data, 2, 1);
        Jogo jogo2 = new Jogo("Gana",
                "Uruguai", data, 0, 2);
        Jogo jogo3 = new Jogo("Sérvia",
                "Suíça", data, 2, 3);
        Jogo jogo4 = new Jogo("Camarões",
                "Brasil", data, 1, 0);
        List<Jogo> listaJogos = new ArrayList<>();
        listaJogos.add(jogo1);
        listaJogos.add(jogo2);
        listaJogos.add(jogo3);
        listaJogos.add(jogo4);

        MinGols.min(listaJogos);
        MaxGols.max(listaJogos);
        TotalGols.total(listaJogos);
    }
}

