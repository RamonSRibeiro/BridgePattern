package padroesestruturais.bridge;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(float saldo) {
        super(saldo);
    }

    public float calcularSaldoComTarifa() {
        return this.saldo + (this.saldo * this.tipoTarifa.percentualRendimento());
    }
}