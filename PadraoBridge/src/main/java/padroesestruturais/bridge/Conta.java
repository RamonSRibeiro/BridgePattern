package padroesestruturais.bridge;

public abstract class Conta {

    protected TipoTarifa tipoTarifa;

    protected float saldo;

    public Conta(float saldo) {
        this.saldo = saldo;
    }

    public void setTipoTarifa(TipoTarifa tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public abstract float calcularSaldoComTarifa();
}