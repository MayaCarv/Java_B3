package Java_B3.Modulo_02.Ex01;

public class Piloto {
    private String nome;
    private int idade;
    private Sexo sexo;
    private String equipe;

    public Piloto(String nome, int idade, Sexo sexo, String equipe) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.equipe = equipe;
    }

    public void imprimirPiloto() {
        System.out.println(
                "\n*** Dados do Piloto ***" +
                        "\nNome: " + nome +
                        "\nIdade: " + idade +
                        "\nSexo: " + sexo +
                        "\nEquipe: " + equipe
        );
    }

    public Piloto() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getEquipe() {
        return equipe;
    }
}
