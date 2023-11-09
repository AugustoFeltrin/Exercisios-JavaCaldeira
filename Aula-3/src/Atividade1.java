import java.time.LocalTime;

public class Atividade1 {

    private String nome;
    private String cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalTime horarioAtual;

    // Construtor
    public Atividade1(String nome, String cpf, int identificadorConta, String banco, String endereco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = LocalTime.now(); // Obtém o horário atual do sistema
    }

    // Métodos

    // Método para realizar um saque
    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Erro ao realizar saque. Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para realizar um depósito
    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Erro ao realizar depósito. Valor inválido.");
        }
    }

    // Método para realizar uma transferência PIX
    public void pix(double valor) {
        System.out.println("Transferência PIX de R$" + valor + " realizada com sucesso.");
    }

    // Método para realizar uma transferência para outra conta bancária
    public void transferencia(Atividade1 destino, double valor) {
        LocalTime horarioLimiteInicio = LocalTime.of(8, 0);
        LocalTime horarioLimiteFim = LocalTime.of(19, 0);

        if (horarioAtual.isAfter(horarioLimiteInicio) && horarioAtual.isBefore(horarioLimiteFim)) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                destino.deposito(valor);
                System.out.println("Transferência de R$" + valor + " para " + destino.nome + " realizada com sucesso.");
            } else {
                System.out.println("Erro ao realizar transferência. Saldo insuficiente ou valor inválido.");
            }
        } else {
            System.out.println("Erro ao realizar transferência. Horário não permitido.");
        }
    }

    // Método para exibir o saldo atual
    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    // Método para exibir o horário atual
    public void verificarHorario() {
        System.out.println("Horário atual: " + horarioAtual);
    }

    // Método para exibir todas as informações da conta bancária
    public void verificarInformacoes() {
        System.out.println("Informações da conta bancária:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Identificador da Conta: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço: " + endereco);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Horário Atual: " + horarioAtual);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Atividade1 conta1 = new Atividade1("Fulano Silva", "123.456.789-00", 1001, "Nubank", "Rua das Laranjas", 1000.0);

        Atividade1 conta2 = new Atividade1("Ciclano Oliveira", "987.654.321-00", 2002, "Bradesco", "Rua dos Limões", 500.0);

        conta1.verificarInformacoes();
        conta1.saque(200.0);
        conta1.deposito(300.0);
        conta1.pix(150.0);
        conta1.transferencia(conta2, 50.0);

        conta1.verificarSaldo();
        conta1.verificarHorario();
    }
}
