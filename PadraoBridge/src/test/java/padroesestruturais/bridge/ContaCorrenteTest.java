package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContaCorrenteTest {

    @Test
    void deveRetornarSaldoComTarifaIsenta() {
        TipoTarifa tipoTarifa = new TarifaIsenta();
        ContaCorrente conta = new ContaCorrente(1000.0f);
        conta.setTipoTarifa(tipoTarifa);
        assertEquals(1000.0f, conta.calcularSaldoComTarifa(), 0.01f);
    }

    @Test
    void deveRetornarSaldoComTarifaBasica() {
        TipoTarifa tipoTarifa = new TarifaBasica();
        ContaCorrente conta = new ContaCorrente(1000.0f);
        conta.setTipoTarifa(tipoTarifa);
        assertEquals(990.0f, conta.calcularSaldoComTarifa(), 0.01f);
    }

    @Test
    void deveRetornarSaldoComTarifaPremium() {
        TipoTarifa tipoTarifa = new TarifaPremium();
        ContaCorrente conta = new ContaCorrente(1000.0f);
        conta.setTipoTarifa(tipoTarifa);
        assertEquals(975.0f, conta.calcularSaldoComTarifa(), 0.01f);
    }

    @Test
    void deveRetornarSaldoComTarifaEmpresarial() {
        TipoTarifa tipoTarifa = new TarifaEmpresarial();
        ContaCorrente conta = new ContaCorrente(1000.0f);
        conta.setTipoTarifa(tipoTarifa);
        assertEquals(950.0f, conta.calcularSaldoComTarifa(), 0.01f);
    }
}