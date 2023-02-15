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
public class Idade {
    
    private String texto;
    
    public Idade()
    {
        System.out.println("Constructor executed");
    }
    
    public String getNumero()
    {
        return texto;
    }
    
    public void setNumero(String texto)
    {
        this.texto = texto;
    }
    
    public void digitarIdade()
    {
        this.setNumero(JOptionPane.showInputDialog("Digite sua idade: "));
    }
    
    public void exibirIdade()
    {
        JOptionPane.showMessageDialog(null, "Sua idade é " + getNumero());
    }
}
