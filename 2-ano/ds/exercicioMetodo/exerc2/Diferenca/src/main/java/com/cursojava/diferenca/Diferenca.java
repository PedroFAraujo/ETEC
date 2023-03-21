/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursojava.diferenca;

import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class Diferenca {
    
    static void diferenca(){
        float numVet[] = new float[2];
        float diferenca = 0;
        numVet[0] = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeira número: "));
        numVet[1] = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
        if (numVet[0] > numVet[1]){
            diferenca = (numVet[0]-numVet[1]);
            JOptionPane.showMessageDialog(null, numVet[0] + " - " + numVet[1] + " = " + diferenca);
        }else{
            diferenca = (numVet[1]-numVet[0]);
            JOptionPane.showMessageDialog(null, numVet[1] + " - " + numVet[0] + " = " + diferenca);
        }

    }
    
    public static void main(String[] args) {
        diferenca();
    }
}
