package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeiculoTest {

    @Test
    public void deveAcelerarCarroComMotorCombustao(){
        Motor motor = new MotorCombustao();
        Carro carro = new Carro(motor);
        assertEquals("Combustão", carro.acelerar());
    }

    @Test
    public void deveAcelerarCarroComMotorEletrico(){
        Motor motor = new MotorEletrico();
        Carro carro = new Carro(motor);
        assertEquals("Eletrico", carro.acelerar());
    }

    @Test
    public void deveAcelerarMotoComMotorCombustao(){
        Motor motor = new MotorCombustao();
        Moto moto = new Moto(motor);
        assertEquals("Combustão", moto.acelerar());
    }

    @Test
    public void deveAcelerarMotoComMotorEletrico(){
        Motor motor = new MotorEletrico();
        Moto moto = new Moto(motor);
        assertEquals("Eletrico", moto.acelerar());
    }

}
