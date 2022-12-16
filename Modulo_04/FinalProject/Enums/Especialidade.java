package Java_B3.Modulo_04.FinalProject.Enums;

import java.util.Arrays;

public enum Especialidade {
    REUMATOLOGISTA,
    ENDOCRINOLOGISTA,
    CLINICA_MEDICA;

    public static Especialidade getEspecialidade(String name) {
        for (Especialidade nomeEspecialidade: Especialidade.values()) {
            if (nomeEspecialidade.name().equals(name)) {
                return nomeEspecialidade;
            }
        }
        return CLINICA_MEDICA;
    }
    public static void imprimeEspecialidade() {
        Arrays.asList(Especialidade.values()).forEach(System.out::println);
    }
}
