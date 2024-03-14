package controller;

import java.util.Scanner;
import exercicios.Aviao15;
import exercicios.CalcularPi2;
import exercicios.Classif5;
import exercicios.Energia11;
import exercicios.Loja14;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            limparTela();
            System.out.println("SELETOR DE EXERC�CIOS 05/03/2024\nEscolha o exerc�cio que deseja executar:");
            System.out.println("1 - Calcular �rea de um C�rculo - Exerc�cio 2");
            System.out.println("2 - Classificar Produtos - Exerc�cio 5");
            System.out.println("3 - Calcular Gasto de Energia - Exerc�cio 11");
            System.out.println("4 - Calcular Valor de Compra com Desconto ou Juros - Exerc�cio 14");
            System.out.println("5 - Reservar Assentos de um Avi�o - Exerc�cio 15");
            System.out.println("0 - Sair");
            System.out.print("Op��o: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    CalcularPi2.executar();
                    break;
                case 2:
                    Classif5.executar();
                    break;
                case 3:
                    Energia11.executar();
                    break;
                case 4:
                    Loja14.executar();
                    break;
                case 5:
                    Aviao15.executar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Op��o inv�lida. Escolha novamente.");
            }
        } while (escolha != 0);

        scanner.close();
    }

    private static void limparTela() {
        // M�todo para limpar a tela do console
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.out.println("Erro ao limpar a tela: " + ex.getMessage());
        }
    }
}
