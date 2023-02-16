/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetor.media.nota;
import javax.swing.JOptionPane; //importa biblioteca javax
/**
 *
 * @author dti
 */
public class main {
    public static void main(String[] args) {
        double vetnota[] = new double[5], media = 0; //declaração de um vetor para armazenar as notas e a media
        String des = ""; //declação para guardar a situação final do aluno
        
        for (int i = 1; i <= 4; i++) { //estrutura repetição para armazenar a nota do aluno ao vetor[] correspondente
            vetnota[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + i + "º bimestre: "));
        }

        media = ((vetnota[1] + vetnota[2] + vetnota[3] + vetnota[4])/4); //calculo da media do aluno
        if (media < 3){ //se a media for menor que tres o aluno esta reprovado
            des = "reprovado";
        } else if (media > 3){ //se a media for maior que tres o aluno esta aprovado
            des = "aprovado";
        } else{ //aluno em exame
            des = "Exame";
        }
        JOptionPane.showMessageDialog(null, "Média: " + media); //janela que exibe a media do aluno
        JOptionPane.showMessageDialog(null, "Aluno " + des); //janela que exibe a situação final do aluno
        
    }
}
