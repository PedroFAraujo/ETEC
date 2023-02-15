/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.padrao;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class nome {
    
    private String texto;
    
    /**
     * Método: Construtor
     */
    public nome()
    {
        System.out.println("Construtor executado");
    }
    
    /**
     * Método Set's e Get's (Encapsulamento)
     */
    public String getTexto()
    {
        return texto;
    }
    
    public void setTexto(String texto)
    {
        this.texto = texto;
    }
    
    /**
     * Método: digitarTexto
     */
    public void digitarTexto()
    {
        this.setTexto(JOptionPane.showInputDialog("Digite seu nome: "));
    }
    
    /**
     * Método: exibitTexto
     */
    public void exibirTexto()
    {
        JOptionPane.showMessageDialog(null, "Seu nome é:  "+ this.getTexto());
    }
}
