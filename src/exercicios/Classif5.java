package exercicios;

import java.util.Scanner;

public class Classif5 {

    public static void executar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o c�digo do produto: ");
        int codigo = input.nextInt();
        
        switch (codigo) {
            case 1:
                System.out.println("Classifica��o: Alimento n�o-perec�vel");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Classifica��o: Alimento perec�vel");
                break;
            case 5:
            case 6:
                System.out.println("Classifica��o: Vestu�rio");
                break;
            case 7:
                System.out.println("Classifica��o: Higiene Pessoal");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Classifica��o: Limpeza e Utens�lios dom�sticos");
                break;
            default:
                System.out.println("C�digo de produto inv�lido!");
        }
        input.close();
        encerrarPrograma();
    }

    private static void encerrarPrograma() {
        System.out.println("Programa encerrado.");
        System.exit(0);
    }
}
