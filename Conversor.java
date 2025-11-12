package conversor;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.print("Escolha um valor: ");
            double valor = leitor.nextDouble();

            System.out.println("Agora escolha uma opção");
            System.out.println("1 - Euro");
            System.out.println("2 - Dólar");
            System.out.print("Escolha: ");
            int opcao = leitor.nextInt();

            double resultado;

            switch (opcao) {
                case 1:
                    resultado = valor * 0.16;
                    System.out.println("Convertendo para Euro...");
                    System.out.println("Resultado: €" + resultado);
                    break;

                case 2:
                    resultado = valor * 5.48;
                    System.out.println("Convertendo para Dólar...");
                    System.out.println("Resultado: $" + resultado);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();
        }
    }
}
