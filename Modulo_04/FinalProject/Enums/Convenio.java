package Java_B3.Modulo_04.FinalProject.Enums;

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
        for (Convenio nomeConvenio : Convenio.values()) {
            System.out.println(nomeConvenio.name());
        }
    }
}
