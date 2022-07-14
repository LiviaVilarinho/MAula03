package one.digitalinnovation.basecamp;

public class Quadrilatero {

    //exemplo de sobrecarga, foi mantido o nome do método e alterado os parâmetros
    //uma assinatura () com diversos parâmetros

    public static double area (double lado) {

        return  lado * lado;
    }

    public static double area (double lado1, double lado2) {

        return lado1 * lado2;
    }

    public static double area (double baseMaior, double baseMenor, double altura) {

        return (baseMaior+baseMenor)*altura/2;
    }

    //return instrução de interrupção

    /*public static float area (float diagonal1, float diagonal2) {

        return (diagonal1 * diagonal2)/2;
    }*/
}
