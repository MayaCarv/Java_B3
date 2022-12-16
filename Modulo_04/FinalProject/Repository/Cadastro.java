package Java_B3.Modulo_04.FinalProject.Repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static Java_B3.Modulo_04.FinalProject.Enums.Convenio.getConvenio;
import static Java_B3.Modulo_04.FinalProject.Enums.Convenio.imprimeConvenio;
import static Java_B3.Modulo_04.FinalProject.Enums.Sexo.getSexo;

public class Cadastro {

    public static void cadastrar(Scanner scanner, PacienteRepository pacienteRepository) {
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

        System.out.println("Digite o convênio:\nLista de convênios aceitos: ");
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

        Address address = new Address();
        address.setRua(rua);
        address.setNumero(numero);
        address.setCep(cep);
        address.setBairro(bairro);
        address.setCidade(cidade);
        address.setEstado(estado);

        Paciente paciente = new Paciente();
        paciente.setNomeCompleto(nomeCompleto);
        paciente.setTelefone(telefone);
        paciente.setSexo(getSexo(sexo));
        System.out.println(dataNascimento + "\n");
        paciente.setDataNascimento(LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        paciente.setConvenio(getConvenio(convenio));
        paciente.setEmail(email);
        paciente.setAddress(address);

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
}

