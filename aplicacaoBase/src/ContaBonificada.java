public class ContaBonificada extends Conta {
    private double bonus;

    public ContaBonificada(String numero, Cliente cliente) {
        super(numero, cliente);
        this.bonus = 0;
    }
    
    public void creditar(double valor) {
        this.bonus = this.bonus + (valor * 0.01);
        super.creditar(valor);
    }

    public void renderBonus() {
        double bonus = getBonus();
        super.creditar(bonus);
        this.bonus = 0;
    }

    public double getBonus() {
        return this.bonus;
    }


}