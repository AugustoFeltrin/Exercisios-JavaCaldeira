class Atividade3 {
    private final String numeroTelefone;
    private final String nome;
    private final String endereco;
    private final String localidade;

    public Atividade3(String numeroTelefone, String nome, String endereco, String localidade) {
        this.numeroTelefone = numeroTelefone;
        this.nome = nome;
        this.endereco = endereco;
        this.localidade = localidade;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLocalidade() {
        return localidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + numeroTelefone + ", Endereço: " + endereco + ", Localidade: " + localidade;
    }
}