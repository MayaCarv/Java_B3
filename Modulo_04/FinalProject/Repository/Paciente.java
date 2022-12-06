package Java_B3.Modulo_04.FinalProject.Repository;

import Java_B3.Modulo_04.FinalProject.Enums.Convenio;
import Java_B3.Modulo_04.FinalProject.Enums.Sexo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Paciente {
    private int id;
    private String nameCompleto;
    private String telefone;
    private Sexo sexo;
    private LocalDate dataNascimento;
    private Convenio convenio;
    private String email;
    private Address address;

    public Paciente() {

    }
    public Paciente(String nameCompleto, String telefone, Sexo sexo, LocalDate dataNascimento, Convenio convenio, String email, Address address) {
        this.nameCompleto = nameCompleto;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.convenio = convenio;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nameCompleto;
    }

    public void setNomeCompleto(String nameCompleto) {
        this.nameCompleto = nameCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    @Override
    public String toString() {
        return "Id = " + id +
                "\n Nome Completo = " + nameCompleto +
                "\n Telefone = " + telefone +
                "\n Sexo = " + sexo +
                "\n Data de Nascimento = " +
                new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento) +
                " (" + getIdade() + " anos)" +
                "\n Convênio = " + convenio +
                "\n Email = " + email +
                "\n Endereço = " + address;
    }
}
