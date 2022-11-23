package Java_B3.Modulo_03.FinalProject.Repository;

import FinalProject.Repository.Paciente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PacienteRepository {
    public static final List<FinalProject.Repository.Paciente> pacientesCadastrados = new ArrayList<>();
    private static int sequencia = 1;
    public void cadastro(FinalProject.Repository.Paciente paciente)
    {
        setId(paciente);
        if (Objects.nonNull(paciente) && Objects.nonNull(paciente.getEndereco())) {
            pacientesCadastrados.add(paciente);
        } else {
            System.err.println("Paciente nulo ou sem Endereço!");
        }
    }
    private void setId(Paciente paciente) {
        paciente.setId(sequencia);
        paciente.getEndereco().setId(sequencia);
        sequencia++;
    }
}

