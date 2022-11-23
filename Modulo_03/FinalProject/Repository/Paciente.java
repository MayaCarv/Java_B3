package Java_B3.Modulo_03.FinalProject.Repository;

import FinalProject.Enums.Convenio;
import FinalProject.Enums.Sexo;
import FinalProject.Repository.Endereco;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Paciente {
    private int id;
    private String nameCompleto;
    private String telefone;
    private Sexo sexo;
    private Date dataNascimento;
    private Convenio convenio;
    private String email;
    private FinalProject.Repository.Endereco endereco;

    public Paciente() {

    }
    public Paciente(String nameCompleto, String telefone, Sexo sexo, Date dataNascimento, Convenio convenio, String email, FinalProject.Repository.Endereco endereco) {
        this.nameCompleto = nameCompleto;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.convenio = convenio;
        this.email = email;
        this.endereco = endereco;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {

        Calendar hoje = Calendar.getInstance();
        if (hoje.after(dataNascimento)) {
            System.err.println("Essa pessoa ainda não nasceu.");
        }
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

    public FinalProject.Repository.Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getIdade(Date dataNascimento)
    {
        Calendar data = new GregorianCalendar();
        data.setTime(dataNascimento);

        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - data.get(Calendar.YEAR);

        data.add(Calendar.YEAR, idade);

        if (hoje.before(data)) {
            idade--;
        }

        if (idade < 0) {
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
                "\n Data de Nascimento = " + new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento) + " (" + getIdade(dataNascimento) + " anos)" +
                "\n Convênio = " + convenio +
                "\n Email = " + email +
                "\n Endereço = " + endereco;
    }
}
