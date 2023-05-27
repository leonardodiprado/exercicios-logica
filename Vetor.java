package com.company;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        int tamanho, valor;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor inteiro e positivo para ser o tamanho do vetor:");
        tamanho = scanner.nextInt();

        //Verificando se o valor lido é realmente inteiro e positivo
        while(tamanho < 0) {
            System.out.println("O valor informado não é positivo.");
            System.out.println("Informe um valor inteiro e positivo para ser o tamanho do vetor:");
            tamanho = scanner.nextInt();
        }

        int [] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe um valor para ser inserido na posição " + i + " do meu vetor:");
            valor = scanner.nextInt();
            vetor[i] = valor;
        }

        for (int i = 0; i < tamanho ; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }
    }
}