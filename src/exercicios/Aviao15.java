package exercicios;

import java.util.Scanner;

public class Aviao15 {
    
    private static final int TAMANHO_DO_AVIAO = 10; // Em maiúsculo -> constante
    private static int[] assentos = new int[TAMANHO_DO_AVIAO]; // int[] -> array
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Pressione 1 para Primeira Classe");
            System.out.println("Pressione 2 para Classe Executiva");
            System.out.println("Pressione 0 para sair");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    reservarAssentoPrimeiraClasse();
                    break;
                case 2:
                    reservarAssentoClasseExecutiva();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao != 0);
        
        scanner.close();
        encerrarPrograma();
    }

    private static void reservarAssentoPrimeiraClasse() {
        for (int i = 0; i < 5; i++) {
            if (assentos[i] == 0) {
                assentos[i] = 1;
                System.out.println("Você reservou com sucesso um assento na primeira classe! Assento: " + (i + 1));
                return;
            }
        }
        System.out.println("Desculpe, todos os assentos na primeira classe estão ocupados.");
    }
    
    private static void reservarAssentoClasseExecutiva() {
        for (int i = 5; i < TAMANHO_DO_AVIAO; i++) {
            if (assentos[i] == 0) {
                assentos[i] = 1;
                System.out.println("Você reservou com sucesso um assento na classe executiva! Assento: " + (i + 1));
                return;
            }
        }
        System.out.println("Desculpe, todos os assentos na classe executiva estão ocupados.");
    }

    private static void encerrarPrograma() {
        System.out.println("Programa encerrado.");
        System.exit(0);
    }
}
