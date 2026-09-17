package padroesestruturais.bridge;

public class ContaCorrente extends Conta {

    public ContaCorrente(float saldo) {
        super(saldo);
    }

    public float calcularSaldoComTarifa() {
        return this.saldo - this.tipoTarifa.valorTarifa();
    }
}