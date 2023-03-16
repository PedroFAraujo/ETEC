package com.etec.metodocomretorno;

//@author Pedro

import javax.swing.JOptionPane;


public class MetodoComRetorno {
    
    static void digite(){
        int tamanhoVar;
        String palavra;
        palavra = JOptionPane.showInputDialog(null, "Digite uma palavra: ");
        tamanhoVar = tamanho(palavra);
        JOptionPane.showMessageDialog(null, "A palavra " + palavra + " possui " + tamanhoVar + " caracteres");
    }
    
    static int tamanho(String x){
        return x.length();
    }
    
    public static void main(String[] args) {
        digite();
    }
}
