package Java_B3.Modulo_03.Ex01;

public enum Doente {
    DOENTE (true),
    SADIO (false);

    private boolean b;
    Doente(boolean b) {
        this.b = b;
    }
}
