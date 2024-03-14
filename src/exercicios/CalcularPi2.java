package exercicios;

import java.util.Scanner;

public class CalcularPi2 {

    public static void executar() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        
        double raio = input.nextDouble();

        double diametro = 2 * raio;

        double circunferencia = 2 * (Math.PI * raio);

        double area = Math.PI * Math.pow(raio, 2);

        // Impressão dos resultados
        System.out.printf("Diâmetro: %.2f\n", diametro);
        System.out.printf("Circunferência: %.2f\n", circunferencia);
        System.out.printf("Área: %.2f\n", area);

        input.close();
        encerrarPrograma();
    }

    private static void encerrarPrograma() {
        System.out.println("Programa encerrado.");
        System.exit(0);
    }
}
