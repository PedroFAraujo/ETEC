/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.poocaixa;

// @author Pedro

import javax.swing.JOptionPane;

 
public class EntradaSaidaDados {
    public String entradaDados (String mensagemEntrada){
        return JOptionPane.showInputDialog(mensagemEntrada);
    }
    
    public void saidaDados (String mensagemSaida){
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
}
