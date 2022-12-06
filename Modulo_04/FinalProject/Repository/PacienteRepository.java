package Java_B3.Modulo_04.FinalProject.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PacienteRepository {
    public static final List<Paciente> pacientesCadastrados = new ArrayList<>();
    private static int sequencia = 1;
    public void cadastro(Paciente paciente)
    {
        setId(paciente);
        if (Objects.nonNull(paciente.getAddress())) {
            pacientesCadastrados.add(paciente);
        } else {
            System.err.println("Paciente nulo ou sem Endereço!");
        }
    }
    private void setId(Paciente paciente) {
        paciente.setId(sequencia);
        paciente.getAddress().setId(sequencia);
        sequencia++;
    }
}

