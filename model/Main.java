package br.com.dio.model;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("Exercício calculadora: ");
//        Calculadora.soma(3,6);
//        Calculadora.subtracao(10,1);
//        Calculadora.multiplicacao(2,3);
//        Calculadora.divisao(20,5);
//
//    }
//    public static void main(String[] args) {
    //quadrilatero
//    System.out.println("Exercício quadrilátero: ");
//    Quadrilatero.area(3);
//    Quadrilatero.area(5,5);
//    Quadrilatero.area(7,8,9);
//    }
//
    public static void main(String[] args) {
        double areaQuadrado = Quadrilatero2.area(3);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(5,5);
        System.out.println("Area do Retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(3,2,6);
        System.out.println("Area do Trapezio: " + areaTrapezio);
    }

}
