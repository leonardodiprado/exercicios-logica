package Trabalho;

import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, operacao;

        // to do (garantir que o tamanho seja positivo e inteiro)
        System.out.println("informe o tamanho do vetor:");
        tamanho = scanner.nextInt();

        // int [] vetor;
        String [] vetor = new String[tamanho];

        do {
            System.out.println("operacao 1 - Inserir todos elementos do vetor");
            System.out.println("operacao 2 - Mostrar todos elementos do vetor");
            System.out.println("operacao 5 - Finalizar o processo \n");

            //to do (garantir que o usuario informe uma operacao valida)
            System.out.println("informe a operacao desejada:");
            operacao = scanner.nextInt();

            if (operacao == 1) {
                //operacao 1
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("insira um valor no vetor na posicao " + i);
                    vetor[i] = scanner.next();

                }
            } else if (operacao == 2) {
                //operacao 2
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("vetor[" + i + "] = " + vetor[i]);
                }
            }

        } while (operacao != 5);

    }
}
