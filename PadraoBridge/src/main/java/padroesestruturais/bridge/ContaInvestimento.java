package padroesestruturais.bridge;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(float saldo) {
        super(saldo);
    }

    public float calcularSaldoComTarifa() {
        return this.saldo + (this.saldo * this.tipoTarifa.percentualRendimento());
    }
}