package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContaInvestimentoTest {

    @Test
    void deveRetornarSaldoComTarifaIsenta() {
        TipoTarifa tipoTarifa = new TarifaIsenta();
        ContaInvestimento conta = new ContaInvestimento(1000.0f);
        conta.setTipoTarifa(tipoTarifa);
        assertEquals(1000.0f, conta.calcularSaldoComTarifa(), 0.01f);
    }

    @Test
    void deveRetornarSaldoComTarifaBasica() {
        TipoTarifa tipoTarifa = new TarifaBasica();
        ContaInvestimento conta = new ContaInvestimento(1000.0f);
        conta.setTipoTarifa(tipoTarifa);
        assertEquals(1010.0f, conta.calcularSaldoComTarifa(), 0.01f);
    }

    @Test
    void deveRetornarSaldoComTarifaPremium() {
        TipoTarifa tipoTarifa = new TarifaPremium();
        ContaInvestimento conta = new ContaInvestimento(1000.0f);
        conta.setTipoTarifa(tipoTarifa);
        assertEquals(1030.0f, conta.calcularSaldoComTarifa(), 0.01f);
    }

    @Test
    void deveRetornarSaldoComTarifaEmpresarial() {
        TipoTarifa tipoTarifa = new TarifaEmpresarial();
        ContaInvestimento conta = new ContaInvestimento(1000.0f);
        conta.setTipoTarifa(tipoTarifa);
        assertEquals(1050.0f, conta.calcularSaldoComTarifa(), 0.01f);
    }
}