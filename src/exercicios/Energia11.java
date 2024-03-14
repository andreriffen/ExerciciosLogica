package exercicios;

import java.util.Scanner;

public class Energia11 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int numeroConsumidor;
        int quantidadeConsumidores = 0;
        int codigoConsumidor;
        
        double consumo;
        double precoKWh;
        double totalPagar = 0;
        double maiorConsumo = 0;
        double menorConsumo = Double.MAX_VALUE;
        
        double totalResidencial = 0;
        double totalComercial = 0;
        double totalIndustrial = 0;
        
        System.out.println("Digite o pre�o do KWh consumido:");
        precoKWh = scanner.nextDouble();

        System.out.println("Digite o n�mero do consumidor (ou -1 para encerrar):");
        numeroConsumidor = scanner.nextInt();

        while (numeroConsumidor != -1) {
            System.out.println("Digite a quantidade de KWh consumidos durante o m�s:");
            consumo = scanner.nextDouble();

            System.out.println("Digite o c�digo do tipo de consumidor (1 - residencial, 2 - comercial, 3 - industrial):");
            codigoConsumidor = scanner.nextInt();

            double totalPagarConsumidor = precoKWh * consumo;
            totalPagar += totalPagarConsumidor;

            if (consumo > maiorConsumo) {
                maiorConsumo = consumo;
            }
            if (consumo < menorConsumo) {
                menorConsumo = consumo;
            }
            
            switch (codigoConsumidor) {
                case 1:
                    totalResidencial += consumo;
                    break;
                case 2:
                    totalComercial += consumo;
                    break;
                case 3:
                    totalIndustrial += consumo;
                    break;
            }

            quantidadeConsumidores++;

            System.out.println("N�mero do consumidor: " + numeroConsumidor + ", Total a pagar: " + totalPagarConsumidor);
            System.out.println("Digite o n�mero do pr�ximo consumidor (ou -1 para encerrar):");
            numeroConsumidor = scanner.nextInt();
        }

        double mediaGeral = totalPagar / quantidadeConsumidores;

        System.out.println("Maior consumo verificado: " + maiorConsumo);
        System.out.println("Menor consumo verificado: " + menorConsumo);
        System.out.println("Total de consumo residencial: " + totalResidencial);
        System.out.println("Total de consumo comercial: " + totalComercial);
        System.out.println("Total de consumo industrial: " + totalIndustrial);
        System.out.println("M�dia geral de consumo: " + mediaGeral);

        scanner.close();
        encerrarPrograma();
    }

    private static void encerrarPrograma() {
        System.out.println("Programa encerrado.");
        System.exit(0);
    }
}
