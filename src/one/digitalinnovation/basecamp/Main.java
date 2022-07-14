package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        //chamadas da sobrecarga
        System.out.println("Exercícios de retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("A área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("A área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("A área do trapézio: " + areaTrapezio);
    }
}
