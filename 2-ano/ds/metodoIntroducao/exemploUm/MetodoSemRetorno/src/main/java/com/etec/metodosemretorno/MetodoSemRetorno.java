//pacote 
package com.etec.metodosemretorno;

//@author Pedro

//importação da classe gráfica do pacote swing
import javax.swing.JOptionPane;

//declaração da classe MetodoSemRetorno
public class MetodoSemRetorno {
    
    //declaração do método sem retorno "digite"
    static void digite(){
        //criacao da variavel a do tipo inteiro
        int a;
        
        //variavel a recebe o que o usuario escrever na janela gráfica swing e converte para int
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        
        //chama o metodo "dobro" com parametro de a
        dobro(a);
    }
    
    //declaração do método sem retorno "dobro"
    static void dobro(int n){
        //declaração da variavel d do tipo inteiro
        int d = (n*2);
        JOptionPane.showMessageDialog(null, "O dobro de " + n + " é " + d);
    }
    
    //declaração do método principal
    public static void main(String[] args) {
        //chama o metodo "digite"
        digite();
    }
}


