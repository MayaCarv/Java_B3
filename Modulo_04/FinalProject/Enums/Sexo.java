package Java_B3.Modulo_04.FinalProject.Enums;

public enum Sexo {
    FEMININO("F"),
    MASCULINO("M"),
    NA (" ");

    private final String sexo;

   Sexo (String sexo) {
        this.sexo = sexo;
    }

    public static Sexo getSexo(String sexo) {
        for (Sexo tipoSexo : Sexo.values()) {
            if (tipoSexo.sexo.equals(sexo)) {
                return tipoSexo;
            }
        }
        return NA;
    }
}
