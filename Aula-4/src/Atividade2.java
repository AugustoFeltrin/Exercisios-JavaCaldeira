import java.util.ArrayList;
import java.util.List;

abstract class FormaGeometrica {
    public abstract double calcularArea();
}

public class Atividade2 {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>();
        formas.add(new Retangulo(5, 3));
        formas.add(new Circulo(4));
        formas.add(new Triangulo(6, 8));
        formas.add(new Quadrado(4));
        formas.add(new Losango(6, 8));

        for (FormaGeometrica forma : formas) {
            System.out.println("Área da forma: " + forma.getClass().getSimpleName() + " é " + forma.calcularArea());
        }
    }

    static class Retangulo extends FormaGeometrica {
        private final double comprimento;
        private final double largura;

        public Retangulo(double comprimento, double largura) {
            this.comprimento = comprimento;
            this.largura = largura;
        }

        @Override
        //@Override é uma forma de garantir que estamos na verdade sobrescrevendo um método e não criando um novo.
        public double calcularArea() {
            return comprimento * largura;
        }
    }

    static class Circulo extends FormaGeometrica {
        private final double raio;

        public Circulo(double raio) {
            this.raio = raio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * raio * raio;
        }
    }

    static class Triangulo extends FormaGeometrica {
        private final double base;
        private final double altura;

        public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return (base * altura) / 2;
        }
    }

    static class Quadrado extends FormaGeometrica {
        private final double lado;

        public Quadrado(double lado) {
            this.lado = lado;
        }

        @Override
        public double calcularArea() {
            return lado * lado;
        }
    }

    static class Losango extends FormaGeometrica {
        private final double diagonalMaior;
        private final double diagonalMenor;

        public Losango(double diagonalMaior, double diagonalMenor) {
            this.diagonalMaior = diagonalMaior;
            this.diagonalMenor = diagonalMenor;
        }

        @Override
        public double calcularArea() {
            return (diagonalMaior * diagonalMenor) / 2;
        }
    }
}