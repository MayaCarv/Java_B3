package Java_B3.Modulo_04.git_aulas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriandoCSV {
    public static void main(String[] args) {
        TestCSV.createCSV();
//        Scanner scanner = new Scanner(System.in);
//        cadastrar(scanner);
    }

    public static void cadastrar(Scanner scanner) {
        System.out.println("\n######## CADASTRO DE PACIENTES ########\n");
        System.out.println("######## Informe seus dados pessoais... ########\n");

        scanner.nextLine();
        System.out.println("Digite o nome completo do paciente:");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite o telefone:\nEx: (00)00000-0000");
        String telefone = scanner.nextLine();

        System.out.println("Digite email:\nEx: nome@email.com");
        String email = scanner.nextLine();

        Paciente paciente = new Paciente();
        paciente.setNameCompleto(nomeCompleto);
        paciente.setTelefone(telefone);
        paciente.setEmail(email);

        Paciente.cadastro(paciente);
        System.out.println("CADASTRO FINALIZADO COM SUCESSO!!\n");
    }
}
class Paciente {
    private String nameCompleto;
    private String telefone;
    private String email;

    public String getNameCompleto() {
        return nameCompleto;
    }

    public void setNameCompleto(String nameCompleto) {
        this.nameCompleto = nameCompleto;
    }

    public String getTelefone() {
        return telefone;
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

    public static void cadastro(Paciente paciente){
        List<Paciente> pacientesCadastrados = new ArrayList<>();
        pacientesCadastrados.add(paciente);
        //TestCSV.createCSV(paciente);
    }
}

class TestCSV {
    public static String nameFile = "./src/Java_B3/Modulo_04/Arquivos_CSV/test.csv";
    public static void createCSV() {
        File arquivo = new File(nameFile);
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(arquivo.exists());
        System.out.println(arquivo.isDirectory());
        System.out.println(arquivo.length());
        System.out.println(DateFormat.getDateTimeInstance().format(arquivo.lastModified()));
//        StringBuilder sb = new StringBuilder();
//        sb.append("Nome Completo");
//        sb.append(',');
//        sb.append("Telefone");
//        sb.append(',');
//        sb.append("Email");
//        sb.append('\n');
//
//        sb.append(paciente.getNameCompleto());
//        sb.append(',');
//        sb.append(paciente.getTelefone());
//        sb.append(',');
//        sb.append(paciente.getEmail());
//        sb.append('\n');
//
//        @Override
//        public String toString () {
//            return "Id = " + id +
//                    "\n Nome Completo = " + nameCompleto +
//                    "\n Telefone = " + telefone +
//                    "\n Sexo = " + sexo;
//
//            arquivo.write(sb.toString());
//            arquivo.close();
//            System.out.println("done!");
//
//            TestCSV testCSV = new TestCSV();
//            testCSV.readCSVFile();
//        }
    }

    public void readCSVFile() {
        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(nameFile))) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(records);
    }
    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }

}

