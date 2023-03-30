
package com.cursojava.hipotenusa;

import javax.swing.JOptionPane;

//@author Pedro
 
public class Hipotenusa { //criacao classe hipotenusa
    
    static void hipotenusa(){ //criacao metodo hipotenusa
        float base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base da hipotenusa: ")); //criacao e atribuicao da variavel base 
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da hipotenusa: ")); //criacao e atribuicao da variavel altura
        double hipotenusa = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2)); //calculo da hipotenusa
        String resultadoHipotenusa = String.format("%.2f",hipotenusa); //formatacao de casas decimais da hipotenusa
        JOptionPane.showMessageDialog(null, "Hipotenusa = " + resultadoHipotenusa); //exibicao da hipotenusa
    }
    
    public static void main(String[] args) { //metodo principal
        hipotenusa(); //chama o metodo hipotenusa()
    }
}
