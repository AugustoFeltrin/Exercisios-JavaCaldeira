import java.util.Scanner;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. O saldo atual é: " + saldo);
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso. Saldo restante: " + saldo);
    }
}

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor que deseja sacar: ");
        double valorSaque = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(1000.0);

        try {
            conta.sacar(valorSaque);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}