package com.mycompany.automotivo;

// @author Pedro

import javax.swing.JOptionPane;

 
public class Automotivo{

    private String modelo, marca,  cor, ano, chassi;
    
    public Automotivo(String modelo, String marca, String cor, String ano, String chassi){
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.chassi = chassi;
    }
    
    public Automotivo(){
        this("", "", "", "", "");
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
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the chassi
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * @param chassi the chassi to set
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
    public void provarExistencial(){
        JOptionPane.showMessageDialog(null, "Modelo: " + getModelo() + "\nMarca: " + getMarca() + "\nCor: " + getCor() + "\nAno: " + getAno() + "\nChassi: " + getChassi());
    }
    
    public void entraDados(){
        setModelo(JOptionPane.showInputDialog("Modelo: "));
        setMarca(JOptionPane.showInputDialog("Marca: "));
        setCor(JOptionPane.showInputDialog("Cor: "));
        setAno(JOptionPane.showInputDialog("Ano: "));
        setChassi(JOptionPane.showInputDialog("Chassi: "));
        
        provarExistencial();
    }
    
}


