
package com.cursojava.lampada;

//@author Pedro

import javax.swing.JOptionPane;


public class Lampada { //criacao classe lampada
     
    public static void mostrarEstado(){ //criacao metodo mostrarEstado
        String estadoLampada = JOptionPane.showInputDialog("Digite o estado da lâmpada: [acesa/apagada]"); //criacao e atribuicao da variavel estadoLampada
        //estrutura decisao para o estado da lampada
        if ("acesa".equals(estadoLampada)){
            JOptionPane.showMessageDialog(null, "A lâmpada está acesa");
        } else if("apagada".equals(estadoLampada)){
            JOptionPane.showMessageDialog(null, "A lâmpada está apagada");
        } else{
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
    
    public static void main(String[] args) { //metodo principal
        mostrarEstado(); //chama o metodo mostrarEstado
    }
}
