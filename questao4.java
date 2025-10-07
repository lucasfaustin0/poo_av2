import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor a ser pago: ");
        double valor = sc.nextDouble();

        System.out.print("Escolha o tipo de pagamento: (1 - Cartão | 2 - Boleto): ");
        int tipo = sc.nextInt();

        Pagamento pagamento;
        if (tipo == 1) {
            pagamento = new CartaoCredito(valor);
        } else {
            pagamento = new Boleto(valor);
        }

        pagamento.processarPagamento();
        sc.close();
    }
}
abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract void processarPagamento();
}

class Boleto extends Pagamento {

    Boleto(double valor) {
        super(valor);
    }
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " realizado com boleto bancário.");
    }
}

class CartaoCredito extends Pagamento {
    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
    }
}
