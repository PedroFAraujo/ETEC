package com.etec.exerc4;

//@author Pedro

public class TestarCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("FIAT", "Uno", "Branco", "Placa123");
        carro.ligar();
        carro.acelerar();
        carro.frear();
        carro.desligar();
        carro.status();
    }
}
