package br.com.conversor.models;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SalvaRequisicao {
    private String moedaEntrada;
    private String moedaSaida;
    private String valor;
    private String data;
    private String hora;


    public void define(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatterDataInvertida = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        data = agora.format(formatterDataInvertida);
        hora = agora.format(formatterHora);
    }

    public void salvarLog(String entrada, String saida, Double valorTotal) throws IOException {
        define();
        moedaEntrada = this.moedaEntrada;
        moedaSaida = this.moedaSaida;
        valor = String.valueOf(valorTotal);

        FileWriter arquivo = new FileWriter(data + hora + ".json");
        arquivo.write();
    }


}
