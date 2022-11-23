package Ex01;

public enum Doente {
    DOENTE (true),
    SADIO (false);

    private boolean b;
    Doente(boolean b) {
        this.b = b;
    }
}
