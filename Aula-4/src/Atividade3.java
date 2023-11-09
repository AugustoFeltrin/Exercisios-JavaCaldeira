interface Tributavel {
    double calculaTributos();
}

class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double obterSaldo() {
        return saldo;
    }
}

class ContaCorrente extends ContaBancaria implements Tributavel {
    @Override
    public double calculaTributos() {
        return saldo * 0.01;
    }
}

class ContaPoupanca extends ContaBancaria implements Tributavel {
    @Override
    public double calculaTributos() {
        return 0;
    }
}

class SeguroDeVida implements Tributavel {
    @Override
    public double calculaTributos() {
        return 42.0;
    }
}

class GerenciadorDeImpostos {
    private double totalTributos = 0;

    public void calcularTributosTotais(Tributavel[] itens) {
        for (Tributavel item : itens) {
            totalTributos += item.calculaTributos();
        }
    }

    public double getTotalTributos() {
        return totalTributos;
    }
}

public class Atividade3 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(2000);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(1000);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        Tributavel[] itens = {contaCorrente, contaPoupanca, seguroDeVida};

        GerenciadorDeImpostos gerenciador = new GerenciadorDeImpostos();
        gerenciador.calcularTributosTotais(itens);

        System.out.println("Total de tributos a pagar: R$" + gerenciador.getTotalTributos());
    }
}