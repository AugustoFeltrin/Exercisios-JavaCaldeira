public class Atividade2 {
    private final double raio;

    public Atividade2(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        // ath.PI é usada para realizar vários cálculos matemáticos e científicos, como encontrar a área e a circunferência de um círculo ou a área da superfície e o volume de uma esfera.
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public static void main(String[] args) {
        Atividade2 circulo1 = new Atividade2(5.0);
        Atividade2 circulo2 = new Atividade2(3.0);

        // Calcular e exibir a área e a circunferência dos círculos
        System.out.println("Círculo 1:");
        System.out.println("Raio: " + circulo1.raio);
        System.out.println("Área: " + circulo1.calcularArea());
        System.out.println("Circunferência: " + circulo1.calcularCircunferencia());

        System.out.println("\nCírculo 2:");
        System.out.println("Raio: " + circulo2.raio);
        System.out.println("Área: " + circulo2.calcularArea());
        System.out.println("Circunferência: " + circulo2.calcularCircunferencia());
    }
}