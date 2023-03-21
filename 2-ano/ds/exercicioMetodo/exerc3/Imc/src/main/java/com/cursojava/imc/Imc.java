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
            String sexo = "";
            double altura = 0.0, imc = 0.0;

            altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
            sexo = JOptionPane.showInputDialog("Digite seu sexo:   [masculino/feminino]");    
            if ("masculino".equals(sexo) || "Masculino".equals(sexo)){
                imc = (72.7*altura)-58;
                JOptionPane.showMessageDialog(null, imc);

            } else if ("feminino".equals(sexo) || "Feminino".equals(sexo)){
                imc = (62.1*altura)-44.7;
                JOptionPane.showMessageDialog(null, imc);
            } else{
                JOptionPane.showMessageDialog(null, "Sexo inválido");
            }
        }
     
    public static void main(String[] args) {
        calcularPesoIdeal();
    }
}
