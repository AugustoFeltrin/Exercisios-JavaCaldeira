import java.util.ArrayList;
import java.util.Scanner;

class Atividade4 {
    private String nomeItem;
    private String dataValidade;

    public Atividade4(String nomeItem, String dataValidade) {
        this.nomeItem = nomeItem;
        this.dataValidade = dataValidade;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return "Item: " + nomeItem + " - Data de Validade: " + dataValidade;
    }
}