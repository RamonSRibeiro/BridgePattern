package padroesestruturais.bridge;

public class TarifaPremium implements TipoTarifa {

    public float valorTarifa() {
        return 25.0f;
    }

    public float percentualRendimento() {
        return 0.03f;
    }
}