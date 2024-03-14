package exercicios;

import java.util.Scanner;

public class Loja14 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da compra:  ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Escolha uma op��o de pagamento: ");
        int opcao = menuOpcao();

        double valorFinal = 0;
        switch (opcao) {
            case 1:
                valorFinal = calcularDesconto(valorCompra);
                break;
            case 2:
                valorFinal = calcularParcela(valorCompra);
                break;
            case 3:
                valorFinal = calcularJuros(valorCompra);
                break;
            default:
                System.out.println("Op��o inv�lida.");
        }

        System.out.println("O valor total a ser pago �: " + valorFinal);

        scanner.close();
        encerrarPrograma();
    }

    private static int menuOpcao() {
        System.out.println("1. � vista com 10% de desconto");
        System.out.println("2. Em duas vezes (pre�o da etiqueta)");
        System.out.println("3. De 3 at� 10 vezes com 3% de juros ao m�s (somente para compras acima de R$100,00)");
        
        //o correto segundo o c�digo de defesa ao consumidor seria at� 5x sem juros, mas vamos fazer EXATAMENTE como pede o enunciado...
        
        return new Scanner(System.in).nextInt();
    }

    private static double calcularDesconto(double valorCompra)
    {
        return valorCompra * 0.9; // se 1.0 � 100%, ent�o 0.9 � 90%
    }

    private static double calcularParcela(double valorCompra)
    {
        return valorCompra / 2;
    }

    private static double calcularJuros(double valorCompra) {
        if (valorCompra <= 100) {
            System.out.println("Desculpe, esta op��o � v�lida apenas para compras acima de R$100,00.");
            return valorCompra;
        }
        else {
            return valorCompra * 1.03;
        }
    }

    private static void encerrarPrograma() {
        System.out.println("Programa encerrado.");
        System.exit(0);
    }
}
