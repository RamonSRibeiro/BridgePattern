package padroesestruturais.bridge;

public class TarifaEmpresarial implements TipoTarifa {

    public float valorTarifa() {
        return 50.0f;
    }

    public float percentualRendimento() {
        return 0.05f;
    }
}