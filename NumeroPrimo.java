package com.company;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i = 2;
        boolean primo = true;

        System.out.println("Informe um valor inteiro e positivo:");
        n = scanner.nextInt();

        //Verificando se o valor lido é realmente inteiro e positivo
        while(n < 0) {
            System.out.println("O valor informado não é positivo.");
            System.out.println("Informe um valor inteiro e positivo:");
            n = scanner.nextInt();
        }

        while(i <= n-1) {
            if(n%i == 0) {
                primo = false;
                break;
            }
            //System.out.println("O valor de i é igual a: " + i);
            i++;
        }

        if(primo == true) {
            System.out.println("O valor " + n + " é primo.");
        } else {
            System.out.println("O valor " + n + " não é primo.");
        }

    }
}