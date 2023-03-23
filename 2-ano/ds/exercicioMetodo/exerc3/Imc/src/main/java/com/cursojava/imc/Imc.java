/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursojava.imc;

import static javax.management.Query.or;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class Imc {
        public static void calcularPesoIdeal(){
            double altura = 0.0, peso = 0.0, imc = 0.0;
            altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:  (m)")); 
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:  (kg)")); 
            imc = peso/(Math.pow(altura,2));
            JOptionPane.showMessageDialog(null, "Seu IMC é de: " + imc);
            }
        
        public static void main(String[] args) {
            calcularPesoIdeal();
        }
}
     
