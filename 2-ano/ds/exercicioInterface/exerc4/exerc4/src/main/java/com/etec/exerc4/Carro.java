package com.etec.exerc4;

import javax.swing.JOptionPane;

//@author Pedro

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    
    public Carro(String marca, String modelo, String cor, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public void ligar(){
        JOptionPane.showMessageDialog(null, "Carro Ligado");
    }
    
    public void desligar(){
        JOptionPane.showMessageDialog(null, "Carro desligado");
    }
    
    public void acelerar(){
        JOptionPane.showMessageDialog(null, "Carro acelerado");
    }
    
    public void frear(){
        JOptionPane.showMessageDialog(null, "Carro freado");
    }
    
    public void status(){
        JOptionPane.showMessageDialog(null, "Marca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nCor: " + this.getCor() + "\nPlaca: " + this.getPlaca());
    }
    
}
