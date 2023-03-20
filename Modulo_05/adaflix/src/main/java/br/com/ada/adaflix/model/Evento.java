package br.com.ada.adaflix.model;

import jakarta.persistence.*;
import javax.swing.text.MaskFormatter;
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "eventos")
public class Evento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String cnpj = "DEFAULT";
    private String nome;
    @Column(unique = true)
    private String descricao;
    private LocalDateTime data;
    private String local;
    private BigDecimal preco;
    private Long capacidade;
    private LocalDateTime inicioVendas;
    @Column(name = "encerramento")
    private LocalDateTime fimVendas;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    public String getCnpj() throws ParseException {
        MaskFormatter mask = new MaskFormatter("###.###.###/####-##");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(cnpj);
    }

    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;
    }

    public Empresa getEmpresa() {

        return empresa;
    }

    public void setEmpresa(Empresa empresa) {

        this.empresa = empresa;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public LocalDateTime getData() {

        return data;
    }

    public void setData(LocalDateTime data) {

        this.data = data;
    }

    public String getLocal() {

        return local;
    }

    public void setLocal(String local) {

        this.local = local;
    }

    public BigDecimal getPreco() {

        return preco;
    }

    public void setPreco(BigDecimal preco) {

        this.preco = preco;
    }

    public Long getCapacidade() {

        return capacidade;
    }

    public void setCapacidade(Long capacidade) {

        this.capacidade = capacidade;
    }

    public LocalDateTime getInicioVendas() {

        return inicioVendas;
    }

    public void setInicioVendas(LocalDateTime inicioVendas) {

        this.inicioVendas = inicioVendas;
    }

    public LocalDateTime getFimVendas() {

        return fimVendas;
    }

    public void setFimVendas(LocalDateTime fimVendas) {

        this.fimVendas = fimVendas;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Long getId() {

        return id;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        try {
            return "\nID: " + id + "\n" +
                    "CNPJ: " + getCnpj() + "\n" +
                    "Empresa: " + empresa + "\n" +
                    "Nome: " + nome + "\n" +
                    "Descricao: " + descricao + "\n" +
                    "Data do Evento: " + data.format(formatter)
                    + "\n" +
                    "Local: " + local + "\n" +
                    "Preço: R$" + preco + "\n" +
                    "Capacidade: " + capacidade + " pessoas\n" +
                    "Início das Vendas: "
                    + inicioVendas.format(formatter) + "\n" +
                    "Fim das Vendas: "
                    + fimVendas.format(formatter) + "\n";
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}