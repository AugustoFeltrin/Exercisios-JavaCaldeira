import java.util.LinkedList;
import java.util.Scanner;

class Atividade6 {
    private String nome;
    private String local;
    private String cpf;
    private String dataEntrada;
    private String dataSaida;

    public Atividade6(String nome, String local, String cpf, String dataEntrada, String dataSaida) {
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    @Override
    public String toString() {
        return "Reserva de " + nome + " para " + local + " (CPF: " + cpf + ") de " + dataEntrada + " a " + dataSaida;
    }
}