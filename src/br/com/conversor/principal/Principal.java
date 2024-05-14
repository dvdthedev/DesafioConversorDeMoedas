package br.com.conversor.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = leitura.nextInt();
        int valor = leitura.nextInt();
        System.out.println(opcao);
        System.out.println(valor);
    }
}
