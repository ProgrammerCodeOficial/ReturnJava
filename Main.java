public class Main {

    public static void main(String[] args) {

        // Return
        System.out.println("========== Exercícios de Retorno ==========");

        double areaQuadrado = Quadrilatero.area(6);
        System.out.println(" Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(10, 10);
        System.out.println(" Área do retêngulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(10, 9, 6);
        System.out.println(" Área do trapézio: " + areaTrapezio);
    }
}