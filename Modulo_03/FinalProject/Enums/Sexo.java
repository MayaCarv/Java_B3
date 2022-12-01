package Java_B3.Modulo_03.FinalProject.Enums;

public enum Sexo {
    FEMININO('F'),
    MASCULINO('M'),
    SEM_DEFINIÇÃO (' ');

    private final char sexo;

    Sexo(char c) {
        sexo = c;
    }

    public static Sexo getSexo(String sexo) {
        for (Sexo tipoSexo : Sexo.values()) {
            if (tipoSexo.name().equals(sexo)) {
                return tipoSexo;
            }
        }
    return SEM_DEFINIÇÃO;
    }
}

