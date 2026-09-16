package org.example;

public abstract class Veiculo {
    Motor motor;

    public Veiculo(Motor motor) {
        this.motor = motor;
    }

    public String acelerar() {
        return motor.ligar();
    }

}
