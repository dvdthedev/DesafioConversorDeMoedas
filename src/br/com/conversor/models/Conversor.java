package br.com.conversor.models;

public class Conversor {
    private String moedaEntrada;
    private String moedaSaida;


    public void conversorOpcao(int opcao){
        switch(opcao){
            case 1:
                moedaEntrada = "USD";
                moedaSaida = "BRL";
                break;
            case 2:
                moedaEntrada = "USD";
                moedaSaida = "CAD";
                break;
            case 3:
                moedaEntrada = "CAD";
                moedaSaida = "USD";
                break;
            case 4:
                moedaEntrada = "CAD";
                moedaSaida = "BRL";
                break;
            case 5:
                moedaEntrada = "BRL";
                moedaSaida = "USD";
                break;
            case 6:
                moedaEntrada = "BRL";
                moedaSaida = "CAD";
                break;
            default:
                System.out.println("Opção inválida.");


        }
    }

    public void Conversao(String moedaEntrada, String moedaSaida, int valor){
    String valorConvertido = String.valueOf(valor);
    String key = "3558e857b5b3868016ebc99c";
    String url = "https://v6.exchangerate-api.com/v6/" + key + "/pair/" + moedaEntrada +"/" +moedaSaida +"/" + valorConvertido;


    }
}
