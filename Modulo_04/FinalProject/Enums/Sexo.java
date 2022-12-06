package Java_B3.Modulo_04.FinalProject.Enums;

public enum Sexo {
    FEMININO('F'),
    MASCULINO('M'),
    NA (' ');

    Sexo(char c) {
    }

    public static Sexo getSexo(String sexo) {
        for (Sexo tipoSexo : Sexo.values()) {
            if (tipoSexo.name().equals(sexo)) {
                return tipoSexo;
            }
        }
    return NA;
    }
}

