package Aulas;

public class Price {
    double banana = 1.69;
    double apple = 1.99;
    double alface = 2.99;
    double couve = 2.49;

    public static double calcPrice(String item, int quant) {
        Price price = new Price();
        double total = 0;

        if (item.equals("Banana")) {
            total = quant * price.banana;
            System.out.printf("- %s: R$%.2f\n", item, total);
        }
        if (item.equals("Maçã")) {
            total = quant * price.apple;
            System.out.printf("- %s: R$%.2f\n", item, total);
        }
        if (item.equals("Alface")) {
            total = quant * price.alface;
            System.out.printf("- %s: R$%.2f\n", item, total);
        }
        if (item.equals("Couve")) {
            total = quant * price.couve;
            System.out.printf("- %s: R$%.2f\n", item, total);
        }
        return total;
    }
}
