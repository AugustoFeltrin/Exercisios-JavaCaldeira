public class Atividade1 {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", "Corolla", 2022);
        Veiculo moto = new Moto("Honda", "CBR 500", 2021);

        int distanciaViagem = 200;

        double custoCarro = carro.calcularCustoViagem(distanciaViagem);
        double custoMoto = moto.calcularCustoViagem(distanciaViagem);

        System.out.println("Custo da viagem de carro: R$" + custoCarro);
        System.out.println("Custo da viagem de moto: R$" + custoMoto);
    }
}