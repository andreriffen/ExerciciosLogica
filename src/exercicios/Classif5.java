package exercicios;

import java.util.Scanner;

public class Classif5 {

    public static void executar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o código do produto: ");
        int codigo = input.nextInt();
        
        switch (codigo) {
            case 1:
                System.out.println("Classificação: Alimento não-perecível");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Classificação: Alimento perecível");
                break;
            case 5:
            case 6:
                System.out.println("Classificação: Vestuário");
                break;
            case 7:
                System.out.println("Classificação: Higiene Pessoal");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Classificação: Limpeza e Utensílios domésticos");
                break;
            default:
                System.out.println("Código de produto inválido!");
        }
        input.close();
        encerrarPrograma();
    }

    private static void encerrarPrograma() {
        System.out.println("Programa encerrado.");
        System.exit(0);
    }
}
