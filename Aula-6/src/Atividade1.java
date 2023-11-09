class Atividade1 {
    private final String titulo;
    private final String categoria;

    public Atividade1(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " (Categoria: " + categoria + ")";
    }
}
