
package com.cursojava.notas;

import javax.swing.JOptionPane;

//@author Pedro

public class Notas { //criacao da classe Notas
   
    static void lerNota(){ //criacao do metodo lerNota()
        float notaVet[] = new float[2]; //criacao do vetor notaVet para armazenar as notas
        String nome = ""; //criacao da String para armazenar o nome
        nome = JOptionPane.showInputDialog("Digite o nome: "); //atribuicao da variavel nome
        notaVet[0] = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: ")); //atribuicao do indice 0 do notaVet
        notaVet[1] = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: ")); //atribuicao do indice 1 do notaVet
        
        JOptionPane.showMessageDialog(null,"Nome: " + nome); //exibicao do nome do aluno
        
        calcularMedia(notaVet[0], notaVet[1]); //chama o metodo calcularMedia com os parametros do notaVet[]
        
    }
    
    static void calcularMedia(float n1, float n2){ //criacao do metodo calcularMedia
        float media = (n1+n2)/2; //calculo da media
        String situacao = ""; //criacao String situacao
        //estrutura de decisao para a situacao
        if(media>=7){
            situacao = "Aprovado";
        } else{
            situacao = "Reprovado";
        }
        JOptionPane.showMessageDialog(null,"Media: " + media + "\nSituação: " + situacao); //exibicao da media e da situacao
    }
    
    public static void main(String[] args) { //metodo main
        lerNota(); //chama o metodo lerNota
    }
}
