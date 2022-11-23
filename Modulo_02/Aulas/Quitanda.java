package Java_B3.Modulo_02.Aulas;

public class Quitanda {
        public static void main(String[] args) {
                Fruta banana = new Fruta();
                banana.nome = "Banana";
                banana.cor = "Amarela";
                banana.quantidade = 5;

                Fruta apple = new Fruta();
                apple.nome = "Maçã";
                apple.cor = "Vermelha";
                apple.quantidade = 12;

                Verdura alface = new Verdura();
                alface.nome = "Alface";
                alface.cor = "Verde";
                alface.quantidade = 2;

                Verdura couve = new Verdura();
                couve.nome = "Couve";
                couve.cor = "Verde";
                couve.quantidade = 1;

                double total = 0;

                System.out.println();
                total += Price.calcPrice(banana.nome, banana.quantidade);
                total += Price.calcPrice(apple.nome, apple.quantidade);
                total += Price.calcPrice(alface.nome, alface.quantidade);
                total += Price.calcPrice(couve.nome, couve.quantidade);
                System.out.printf("\nTotal a pagar: R$%.2f\n", total);


        }
}
