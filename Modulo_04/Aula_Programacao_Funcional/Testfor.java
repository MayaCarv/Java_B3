//package Java_B3.Modulo_04.Aula_Programacao_Funcional;
//
////interface Strategy {
////    double apply(double a, double b);
////}
//
//interface Teste3 {
//    double tres(double a, double b , double c);
//}
//
//class ContextTest {
//    private final Teste3 test3;
//    ContextTest(Teste3 test3) {
//        this.test3 = test3;
//    }
//    public double execute2(double a, double b, double c){
//        return test3.tres(a, b, c);
//
//}
////class Context {
////    private final Strategy strategy;
////    Context(Strategy strategy) {
////        this.strategy = strategy;
////    }
////    public double execute(double a, double b){
////        return strategy.apply(a, b);
////    }
////}
//
////public class Testfor {
////    public static void main(String[] args) {
////
//////        System.out.println("\nMínimo de dois números: " +
//////                new Context((a, b) -> Math.min(a, b)).execute(4.0, 5.0));
//////
//////        System.out.println("\nMínimo de dois números: " +
//////                new Context(Math::min).execute(4.0, 5.0));
//////
//////        System.out.println("\nMáximo de dois números: " +
//////                new Context((a, b) -> a > b ? a : b).execute(4.0, 5.0));
//////
//////        System.out.println("\nMédia de dois números: " +
//////                new Context((a, b) -> (a + b) / 2).execute(4.0, 5.0));
////
//////        System.out.println("\nMínimo de três números: " +
//////                new ContextTest(Math::min).execute2(4.0, 5.0, 3.0));
////    }
////}
