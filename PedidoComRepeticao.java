package com.company;

import java.util.Scanner;

public class PedidoComRepeticao {
    public static void main(String[] args) {
        String nome;
        int codigo, quantidadeLanches;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = scanner.nextLine();

        System.out.println("O nome da pessoa é: " + nome);

        System.out.println("Informe um código de lanche:");
        codigo = scanner.nextInt();
        System.out.println("O código lido é igual a: " + codigo);

        while (codigo < 100 || codigo > 104) {
            System.out.println("O código informado não é válido.");
            System.out.println("Informe um novo código:");
            codigo = scanner.nextInt();
        }

        System.out.println("Código válido");
        System.out.println("Informe a quantidade do lanche com o código " + codigo + " :");
        quantidadeLanches = scanner.nextInt();

        if(codigo == 100) {
            System.out.println("O valor total do do pedido de Cachorro-quente é igual a: " + 15*quantidadeLanches + "R$");
        } else if(codigo == 101) {
            System.out.println("O valor total do do pedido de Bauru simples é igual a: " + 10*quantidadeLanches + " R$");
        } else if(codigo == 102) {
            System.out.println("O valor total do do pedido de Bauru com ovo é igual a: " + 12*quantidadeLanches + " R$");
        } else if(codigo == 103) {
            System.out.println("O valor total do do pedido de Hamburger é igual a: " + 15*quantidadeLanches + " R$");
        } else {
            System.out.println("O valor total do do pedido de Cheeseburger é igual a: " + 16*quantidadeLanches + " R$");
        }
    }
}