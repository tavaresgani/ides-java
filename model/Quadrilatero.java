package br.com.dio.model;

public class Quadrilatero {
    public static void area(double lado){
        System.out.println("Área do quadrado: " + lado*lado);
    }
    public static void area(double lado1, double lado2){
        System.out.println("Área do retângulo: " + lado1*lado2);
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapezio: " + ((baseMaior+baseMenor)*altura)/2);
    }
}
