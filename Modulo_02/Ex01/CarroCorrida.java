package Java_B3.Modulo_02.Ex01;

public class CarroCorrida {
    private int numeroCarro;
    private Piloto piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;

    public CarroCorrida(int numeroCarro, Piloto piloto, float velocidadeMaxima, float velocidadeAtual, boolean ligado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    public void imprimirCarro() {
        System.out.println(
                "\n*** Dados do Carro ***" +
                        "\nCarro: " + numeroCarro +
                        "\nVelocidade máxima: " + velocidadeMaxima + "km/h" +
                        "\nPiloto: " + piloto.getNome()
        );
    }

    public CarroCorrida() {
    }

    public void setNumeroCarro(int numeroCarro){
        this.numeroCarro = numeroCarro;
    }

    public void setPiloto(Piloto piloto){
        this.piloto = piloto;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setVelocidadeAtual(float velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public int getNumeroCarro(){
      return numeroCarro;
    }

    public Piloto getPiloto(){
        return piloto;
    }

    public float getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public float getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public boolean getLigado(){
       return ligado;
    }

    public void acelerar(float velocidade)
    {
        if (velocidadeAtual == velocidadeMaxima) {
            System.out.println("Carro " + numeroCarro +
                            " já está na velocidade máxima de " +
                            velocidadeAtual +
                            "km/h\nImpossível acelerar mais.!!");
            return;
        }
        if(ligado) {
            if (velocidadeAtual + velocidade < velocidadeMaxima) {
                velocidadeAtual += velocidade;
                System.out.println("Carro " + numeroCarro +
                        " acelerou!!! Nova velocidade: " +
                        velocidadeAtual + "km/h");
            } else {
                velocidadeAtual = velocidadeMaxima;
                System.out.println("Carro " + numeroCarro +
                        " acelerou!!! Nova velocidade: " +
                        velocidadeAtual + "km/h" +
                        "\nPorém, a velocidade máxima do carro " +
                        numeroCarro + " foi atingida!!!\n");
            }
        }
        else
            System.out.println("Carro " + numeroCarro + " Desligado");
    }

    public void frear(float velocidade)
    {
        if (velocidadeAtual == 0) {
            System.out.println("Carro " + numeroCarro +
                    " já está parado, impossível frear!!");
            return;
        }
        if(ligado) {
            if (velocidadeAtual - velocidade > 0) {
                velocidadeAtual -= velocidade;
                System.out.println("Carro " + numeroCarro +
                        " freou!!! Nova velocidade: " +
                        velocidadeAtual + "km/h");
            } else {
                velocidadeAtual = 0;
                System.out.println("Carro " + numeroCarro +
                        " freou!!! Nova velocidade: " +
                        velocidadeAtual + "km/h" +
                        "\nPorém, o carro " +
                        numeroCarro + " atigiu a velocidade mínima e parou!!!\n");
            }
        }
        else
            System.out.println("Carro " + numeroCarro + " Desligado");
    }

    public void parar()
    {
        System.out.println("Carro " + numeroCarro + " parado!!");
        velocidadeAtual = 0;
    }

    public void ligar()
    {
        if (ligado == false) {
            System.out.println("Carro " + numeroCarro + " ligado!!");
            ligado = true;
        }
        else
            System.out.println("Carro " + numeroCarro + " já estava ligado!!");
    }

    public void desligar()
    {
        if(velocidadeAtual == 0)
        {
            System.out.println("Carro " + numeroCarro + " desligado!!");
            ligado = false;
        }
        else
            System.out.println("Impossível desligar, carro " + numeroCarro + " está em movimento!!!");
    }
}
