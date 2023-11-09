class Atividade3 {
    private final String titulo;
    private final String data;
    private final String descricao;

    public Atividade3(String titulo, String data, String descricao) {
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }


    @Override
    public String toString() {
        return "Tarefa: " + titulo + "\nData: " + data + "\nDescrição: " + descricao + "\n";
    }
}
