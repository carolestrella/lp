public class Poupanca extends Conta {
    public Poupanca (String numero, Cliente cliente) {
        super(numero, cliente);
    }

    public void renderJuros (double t) {
        double saldo_atual = getSaldo();
        this.creditar(saldo_atual * t);
    }
}
