package com.mwguerra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--------------");
            System.out.println("MENU DE OPÇÕES:\n");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Sair\n");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            System.out.println("--------------");

            switch(opcao) {
                case 1:
                    System.out.println("Você escolheu a primeira opção");
                    break;
                case 2:
                    System.out.println("Você escolheu a segunda opção");
                    break;
                case 3:
                    System.out.println("O programa foi encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(opcao != 3);
    }
}
