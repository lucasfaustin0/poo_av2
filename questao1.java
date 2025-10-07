public class Formas {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        c.exibirNome();
        System.out.println("Área: " + c.calcularArea());
    }
}
abstract class Forma {
    protected String nome;
    public Forma(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();
    public void exibirNome() {
        System.out.println("Forma: " + nome);
    }

}
class Circulo extends Forma {
    private double raio;
    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
