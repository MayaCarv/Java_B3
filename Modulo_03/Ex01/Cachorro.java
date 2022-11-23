package Ex01;

public class Cachorro {

    private String nome;
    private String raca;

    private int idade;
    private boolean estaDoente;

    private Dono dono;


    private static int contador;

    // construtores, que podem ser usados para a cria??o de objetos
    public Cachorro(){
        contador++;
    }

    public Cachorro(String nome){
        contador++;
        this.nome = nome;
    }

    public Cachorro(String nome, int idade){
        contador++;
        this.nome = nome;
        setIdade(idade);
    }

    public void setEstaDoente(boolean estaDoente) {

        this.estaDoente = estaDoente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {

        this.raca = raca;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.err.println("Cachorro não pode ter idade negativa");
        } else if(idade > 30) {
            System.err.println("Não é permitido cachorros com idades superiores a 29 anos");
        } else {
            this.idade = idade;
        }
    }

    public boolean isEstaDoente() {
        return estaDoente;
    }

    public static int getContador() {

        return contador;
    }

    public String getNome() {

        return nome;
    }

    public String getRaca() {

        return raca;
    }

    public int getIdade() {

        return idade;
    }

    public Dono getDono() {

        return dono;
    }

    public void setDono(Dono dono) {

        this.dono = dono;
    }

    public static void setContador(int contador) {

        Cachorro.contador = contador;
    }

    @Override
    public String toString() {
        return "Cachorro -> {" +
                "nome do Cachorro = '" + nome + '\'' +
                ", raca = '" + raca + '\'' +
                ", idade = " + idade +
                ", estaDoente = " + estaDoente +
                ", ID = " + contador +
                '}';
    }
}