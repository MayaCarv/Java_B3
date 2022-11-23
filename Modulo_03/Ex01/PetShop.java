package Ex01;

import java.util.Scanner;

public class PetShop {

    public static void main(String[] args){

        Endereco endereco1 = new Endereco();

        CadastroCachorro cadastroCachorro = new CadastroCachorro();
        Cachorro cachorro = new Cachorro("Doguinho");
        cadastroCachorro.listar(cachorro);

        Cachorro cachorro0 = new Cachorro("Doguinho 2", 15);
        cadastroCachorro.listar(cachorro0);

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Cacau");
        cadastroCachorro.listar(cachorro1);
        cachorro1.setRaca("Vira lata caramelo");
        cachorro1.setIdade(1);

        System.out.println("Idade do " + cachorro1.getNome()+ " é " + cachorro1.getIdade());

        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("Spike");
        cachorro2.setRaca("PitBull");
        cachorro2.setIdade(15);
        cachorro2.setEstaDoente(true);
        cadastroCachorro.listar(cachorro2);

        Cachorro cachorro3 = new Cachorro();
        cachorro3.setNome("Bob");
        cachorro3.setRaca("Pastor Alemao");
        cachorro3.setIdade(10);
        cachorro3.setEstaDoente(true);
        cadastroCachorro.listar(cachorro3);

        System.out.println("Idade do " + cachorro2.getNome()+ " é " + cachorro2.getIdade());

        System.out.println("-----------------IMPRIMINDO OS DOGS--------------------");
        System.out.println(cachorro);
        System.out.println(cachorro0);
        System.out.println(cachorro1);
        System.out.println(cachorro2);
        System.out.println(cachorro3);

        Internacoes internacoes  = new Internacoes();
        internacoes.internar(cachorro2);
        internacoes.internar(cachorro3);

        internacoes.mostraCachorrosInternados();

        cadastroCachorro.mostraListaCachorros();


    }
}
