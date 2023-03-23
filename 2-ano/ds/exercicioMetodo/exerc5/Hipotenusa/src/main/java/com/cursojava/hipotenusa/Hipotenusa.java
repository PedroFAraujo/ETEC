/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursojava.hipotenusa;

import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class Hipotenusa {
    
    static void hipotenusa(){
        float base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base da hipotenusa: "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da hipotenusa: "));
        double hipotenusa = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
        JOptionPane.showMessageDialog(null, "Hipotenusa = " + hipotenusa);
    }
    
    public static void main(String[] args) {
        hipotenusa();
    }
}
