package br.com.conversor.models;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    Gson gson = new GsonBuilder().create();

    private String moedaEntrada;
    private String moedaSaida;

    public String getMoedaEntrada() {
        return moedaEntrada;
    }

    public String getMoedaSaida() {
        return moedaSaida;
    }

    private void setMoedaEntrada(String moedaEntrada) {
        this.moedaEntrada = moedaEntrada;
    }

    private void setMoedaSaida(String moedaSaida) {
        this.moedaSaida = moedaSaida;
    }

    public void conversorOpcao(int opcao){

        switch(opcao){
            case 1:
                setMoedaEntrada("USD");
                setMoedaSaida("BRL");
                break;
            case 2:
                setMoedaEntrada("USD");
                setMoedaSaida("CAD");
                break;
            case 3:
                setMoedaEntrada("CAD");
                setMoedaSaida("USD");
                break;
            case 4:
                setMoedaEntrada("CAD");
                setMoedaSaida("BRL");
                break;
            case 5:
                setMoedaEntrada("BRL");
                setMoedaSaida("USD");
                break;
            case 6:
                setMoedaEntrada("BRL");
                setMoedaSaida("CAD");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    public String conversao(double valor) throws IOException, InterruptedException {



        this.moedaEntrada = getMoedaEntrada();
        this.moedaSaida = getMoedaSaida();

        String valorConvertido = String.valueOf(valor);
        String key = "3558e857b5b3868016ebc99c";
        String url = "https://v6.exchangerate-api.com/v6/" + key + "/pair/" + moedaEntrada +"/" +moedaSaida +"/" + valorConvertido;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();


        ConversaoExchangeRate conversao = gson.fromJson(json, ConversaoExchangeRate.class);
        String resultado = conversao.conversion_result();





    return resultado;
    }
}
