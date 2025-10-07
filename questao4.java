abstract class Pagamento {
    protected double valor;
    public Pagamento(double valor) {
        this.valor = valor;
    }
    public abstract void processarPagamento();
}

class CartaoCredito extends Pagamento {
    public CartaoCredito(double valor) {
        super(valor);
    }
    public void processarPagamento() {
        System.out.println("Pagamento de " + valor + "R$ realizado com cartão de crédito.");
    }
}

class Boleto extends Pagamento {
    public Boleto(double valor) {
        super(valor);
    }
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " realizado via boleto bancário.");
    }
}
