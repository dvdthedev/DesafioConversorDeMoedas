package br.com.conversor.principal;

import br.com.conversor.models.Conversor;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {

            Scanner leitura = new Scanner(System.in);
            System.out.println("""
                    **********************************************************************************************
                    Bem vindo(a) ao ConversorAPI
                    Selecione uma opção de conversão: 
                                    
                    1 - Dólar americano para Real brasileiro
                    2 - Dólar americano para Dólar canadense
                    3 - Dólar canadense para Dólar americano
                    4 - Dólar canadense para Real brasileiro
                    5 - Real brasileiro para Dólar americano
                    6 - Real brasileiro para Dólar canadense
                    **********************************************************************************************
                    """);

            int opcao = leitura.nextInt();

            try {

                while (opcao >= 7 || opcao <= 0) {
                    System.out.println("Digite uma opção entre 1 e 6");
                    opcao = leitura.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println("O programa espera um número entre 1 e 6");
            }

            Conversor conversor = new Conversor();
            conversor.conversorOpcao(opcao);
            System.out.println("Digite o valor que deseja converter, não utilize pontos, apenas vírgula");
            double valor = leitura.nextDouble();

            double resultado = Double.parseDouble(conversor.conversao(valor));
            System.out.println(String.format("Valor em %s $%.2f convertido para %s: $%.2f",conversor.getMoedaEntrada(), valor,conversor.getMoedaSaida(), resultado));
        } catch (InputMismatchException e){
            System.out.println("O programa esperava um número de 1 a 6 e em seguida um valor sem pontos.");

        }



    }
}
