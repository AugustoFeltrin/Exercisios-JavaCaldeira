import java.util.LinkedList;
import java.util.Scanner;

class Atividade5 {
    private String nomeDocumento;
    private int numeroPaginas;

    public Atividade5(String nomeDocumento, int numeroPaginas) {
        this.nomeDocumento = nomeDocumento;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNomeDocumento() {
        return nomeDocumento;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Documento: " + nomeDocumento + " - Páginas: " + numeroPaginas;
    }
}