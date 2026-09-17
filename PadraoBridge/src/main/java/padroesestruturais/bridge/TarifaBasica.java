package padroesestruturais.bridge;

public class TarifaBasica implements TipoTarifa {

    public float valorTarifa() {
        return 10.0f;
    }

    public float percentualRendimento() {
        return 0.01f;
    }
}