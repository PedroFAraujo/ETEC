/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automotivo;

//importacao da biblioteca
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class Automotivo {
    //declaração variaveis
    private String modelo, marca, cor;
    private Integer ano;
    
    //declaração do metodo construtor sem parametro
    public Automotivo(){
        this("", "", 0, "");
    }
    
    //declaração do metodo construtor com parametro e referenciando 
    public Automotivo(String modelo, String marca, Integer ano, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }
    
    //Métodos get e set, set colocar dado, get pegar dado
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
     * @return the ano
     */
    public Integer getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Integer ano) {
        this.ano = ano;
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
    
    //declaração do metodo provarExistencia, mostrar os dados usuario colocou
    public void provarExistencia(){
        //System.out.println("Modelo: " + this.getModelo());
        //System.out.println("Marca: " + this.getMarca());
        //System.out.println("Ano: " + this.getAno());
        //System.out.println("Cor: " + this.getCor());
        
        JOptionPane.showMessageDialog(null, "Modelo: " + this.getModelo() + "\nMarca: " + this.getMarca() + "\nAno: " + this.getAno() + "\nCor: " + this.getCor());
        //JOptionPane.showMessageDialog(null, "Modelo: " + this.getModelo());
        //JOptionPane.showMessageDialog(null, "Marca: " + this.getMarca());
        //JOptionPane.showMessageDialog(null, "Ano: " + this.getAno());
        //JOptionPane.showMessageDialog(null, "Cor: " + this.getCor());
    }
    
    //declaração do metodo entraDados, usuario colocar dados
    public void entraDados(){
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        setModelo(modelo);
        marca = JOptionPane.showInputDialog("Marca: ");
        setMarca(marca);
        ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        setAno(ano);
        String cor = JOptionPane.showInputDialog("Cor: ");
        setCor(cor);
    }
    
    
    public static void main(String[] args) {
        Automotivo auto = new Automotivo();
        auto.entraDados();
        auto.provarExistencia();
    }
    
}
