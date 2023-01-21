package br.com.ada.business.model;

import jakarta.persistence.*;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.Objects;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    //@Column(unique = true)
    private String cpf;
    private String email;
    private String cep;
    private String logradouro;
    private String casa;
    private String bairro;

    private String cidade;
    private String estado;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() throws ParseException {
        MaskFormatter mask = new MaskFormatter("(##) #####-####");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(telefone);
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() throws ParseException {
        MaskFormatter mask = new MaskFormatter("###.###.###-##");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(cpf);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() throws ParseException {
        MaskFormatter mask = new MaskFormatter("#####-###");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(cep);
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
