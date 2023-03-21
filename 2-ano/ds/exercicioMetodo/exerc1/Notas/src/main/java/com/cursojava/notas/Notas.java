/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursojava.notas;

import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class Notas {
   
    static void lerNota(){
        float nota[] = new float[2];
        String nome = "";
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        nota[0] = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota[1] = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
        
        JOptionPane.showMessageDialog(null,"Nome: " + nome);
        
        calcularMedia(nota[0], nota[1]);
        
    }
    
    static void calcularMedia(float n1, float n2){
        float media = (n1+n2)/2;
        String situacao = "";
        if(media>7){
            situacao = "Aprovado";
        } else{
            situacao = "Reprovado";
        }
        JOptionPane.showMessageDialog(null,"Media: " + media + "\nSituação: " + situacao);
    }
    
    public static void main(String[] args) {
        lerNota();
    }
}
