public class Funcionarios {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
                new Gerente("Carlos", 5000),
                new Vendedor("Ana", 3000)
        };
        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
    }
}
abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Final: R$" + calcularSalario());
    }

}
class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return salarioBase * 1.20;
    }

}
class Vendedor extends Funcionario {
    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return salarioBase * 1.10;
    }

}
