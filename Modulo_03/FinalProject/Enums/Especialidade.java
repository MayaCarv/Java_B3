package FinalProject.Enums;

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
}
