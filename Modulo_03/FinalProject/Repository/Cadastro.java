package FinalProject.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import static FinalProject.Enums.Convenio.getConvenio;
import static FinalProject.Enums.Convenio.imprimeConvenio;
import static FinalProject.Enums.Sexo.getSexo;

public class Cadastro {

    public static void cadastrar(Scanner scanner, PacienteRepository pacienteRepository) throws ParseException {
        System.out.println("\n######## CADASTRO DE PACIENTES ########\n");
        System.out.println("######## Informe seus dados pessoais... ########\n");

        scanner.nextLine();
        System.out.println("Digite o nome completo do paciente:");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite o telefone:\nEx: (00)00000-0000");
        String telefone = scanner.nextLine();

        System.out.println("Digite o sexo:\nEx: F ou M");
        String sexo = scanner.nextLine();

        System.out.println("Digite a data de nascimento:\nEx: 00/00/0000");
        String dataNascimento = scanner.nextLine();

        System.out.println("Digite o convênio:\nLista de convêncios aceitos: ");
        imprimeConvenio();
        String convenio = scanner.nextLine();

        System.out.println("Digite email:\nEx: nome@email.com");
        String email = scanner.nextLine();

        System.out.println("######## Informe os dados do endereço... ########");

        System.out.println("Digite a rua:");
        String rua = scanner.nextLine();

        System.out.println("Digite o número da casa:");
        String numero = scanner.nextLine();

        System.out.println("Digite o cep:\nEx: 00000-000");
        String cep = scanner.nextLine();

        System.out.println("Digite o bairro:");
        String bairro = scanner.nextLine();

        System.out.println("Digite a cidade:");
        String cidade = scanner.nextLine();

        System.out.println("Digite o estado:");
        String estado = scanner.nextLine();

        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setCep(cep);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);

        Paciente paciente = new Paciente();
        paciente.setNomeCompleto(nomeCompleto);
        paciente.setTelefone(telefone);
        paciente.setSexo(getSexo(sexo));
        paciente.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento));
        paciente.setConvenio(getConvenio(convenio));
        paciente.setEmail(email);
        paciente.setEndereco(endereco);

        pacienteRepository.cadastro(paciente);
        System.out.println("CADASTRO FINALIZADO COM SUCESSO!! ACESSE A OPÇÃO 2 PARA VER CADASTROS\n");
    }

    public static void imprimePacientesCadastrados() {
        System.out.println("_____________PACIENTES CADASTRADOS:_____________");
        for (Paciente paciente : PacienteRepository.pacientesCadastrados) {
            System.out.println(paciente);
        }
        if (PacienteRepository.pacientesCadastrados.isEmpty()) {
            System.out.println("_____________NENHUM PACIENTE CADASTRADO_____________\n");
        }
    }
    public static void editaPaciente() {
        System.out.println("\n*** Edição de Cadastro ***");

        Paciente paciente = Search.searchID();
        if (paciente != null) {


        }


    }

    public static void apagaCadastro() {
        System.out.println("_____________LIMPANDO O CADASTRO______________\n");
        PacienteRepository.pacientesCadastrados.clear();
    }
}