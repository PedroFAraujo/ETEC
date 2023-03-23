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
public class Diferenca { //criacao classe diferenca
     
    static void diferenca(){ //criacao do metodo diferenca
        float numVet[] = new float[2]; //criacao do vetor numVet para armazenar os numeros
        float diferenca = 0; //criacao da variavel diferenca
        numVet[0] = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: ")); //atribuicao do indice 0 do numVet
        numVet[1] = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: ")); //atribuicao do indice 1 do numVet
        //estrutura de decisao para calcular a diferenca dos numeros
        if (numVet[0] > numVet[1]){
            diferenca = (numVet[0]-numVet[1]);
            JOptionPane.showMessageDialog(null, numVet[0] + " - " + numVet[1] + " = " + diferenca);
        }else{
            diferenca = (numVet[1]-numVet[0]);
            JOptionPane.showMessageDialog(null, numVet[1] + " - " + numVet[0] + " = " + diferenca);
        }

    }
    
    public static void main(String[] args) { //metodo principal
        diferenca(); //chama o metodo diferenca
    }
}
