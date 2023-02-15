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
    
    private String idade;
    
    public Idade()
    {
        System.out.println("Constructor executed");
    }
    
    public String getIdade()
    {
        return idade;
    }
    
    public void setIdade(String Idade)
    {
        this.idade = idade;
    }
    
    public void digitarIdade()
    {
        this.setIdade(JOptionPane.showInputDialog("Digite sua idade: "));
    }
    
    public void exibirIdade()
    {
       JOptionPane.showMessageDialog(null, "Idade digitada foi " + this.getIdade()); 
    }
    
}