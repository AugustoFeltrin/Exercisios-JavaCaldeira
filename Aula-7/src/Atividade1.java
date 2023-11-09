interface Atividade1 {
    void desenhar();
}
class Circulo implements Atividade1 {
    @Override
    public void desenhar() {
        System.out.println("Irei desenhar o círculo ⚪");
    }
}
class Quadrado implements Atividade1 {
    @Override
    public void desenhar() {
        System.out.println("Irei desenhar o quadrado ⬜");
    }
}