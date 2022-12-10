package Java_B3.Modulo_04.Aula_revisão;

import java.time.LocalDate;
import java.time.Period;

public class Contato {

    private int id;
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;

    public Contato(int id, String nome, String telefone, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade()
    {
        Period dif = dataNascimento.until(LocalDate.now());
        int idade = dif.getYears();

        if (idade < 0 || idade > 120) {
            System.err.println("Data de nascimento inválida!!!");
            return 0;
        }
        return idade;
    }

}
