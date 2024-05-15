package br.com.conversor.models;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SalvaRequisicao {
    private String moedaEntrada;
    private String moedaSaida;
    private String data;
    private String hora;
    private String valor;

    public void define(){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatterDataInvertida = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        data = agora.format(formatterDataInvertida);
        hora = agora.format(formatterHora);

    }

}
