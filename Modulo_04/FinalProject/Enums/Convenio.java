package Java_B3.Modulo_04.FinalProject.Enums;

import java.util.Arrays;

public enum Convenio {
    UNIMED,
    BRADESCO,
    HAPVIDA,
    SULAMERICA,
    PARTICULAR;

    public static Convenio getConvenio(String name) {
        for (Convenio nomeConvenio : Convenio.values()) {
            if (nomeConvenio.name().equals(name)) {
                return nomeConvenio;
            }
        }
        return PARTICULAR;
    }

    public static void imprimeConvenio() {
        Arrays.asList(Convenio.values()).forEach(System.out::println);
    }
}
