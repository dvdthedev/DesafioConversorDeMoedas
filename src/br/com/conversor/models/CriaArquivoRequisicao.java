package br.com.conversor.models;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CriaArquivoRequisicao {
    private String moedaEntrada;
    private String moedaSaida;
    private String valor;
    private String data;
    private String hora;

    public void define(){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatterDataInvertida = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        data = agora.format(formatterDataInvertida);
        hora = agora.format(formatterHora);
    }

    public String getMoedaEntrada() {
        return moedaEntrada;
    }

    public String getMoedaSaida() {
        return moedaSaida;
    }

    public String getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public CriaArquivoRequisicao(String moedaEntrada, String moedaSaida, String valor) {
        this.moedaEntrada = moedaEntrada;
        this.moedaSaida = moedaSaida;
        this.valor = valor;
        define();
    }

    @Override
    public String toString() {
        return "CriaArquivoRequisicao{" +
                "moedaEntrada='" + moedaEntrada + '\'' +
                ", moedaSaida='" + moedaSaida + '\'' +
                ", valor='" + valor + '\'' +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}
