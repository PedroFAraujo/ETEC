//pacote do nucleo
package com.mycompany.lernota;

//importacao da biblioteca para a utilizacao da interface grafica JOptionPane
import javax.swing.JOptionPane;

//@author Pedro

//instancia da classe LerNota()
public class LerNota {
    //método principal da classe LerNota
    public static void main(String[] args) {
        //chamar método lerNota()
        lerNota();
    }
    //fechamento do método principal
    
    //método que lê o nome e as notas
    static void lerNota(){
        double notaVetor[] = new double[5]; //declaração do vetor para armazenar as notas
        String nome; //declaração da variavel para armazenar nome
        nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: "); //interface grafica para o usuario digitar o nome e armazenar na variavel nome     
        for (int i = 1; i <= 4; i++) { //estrutura repetição para armazenar a nota do aluno ao vetor[] correspondente
            notaVetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + i + "º bimestre: ")); //interface grafica para digitar a nota do bimestre
        }
        JOptionPane.showMessageDialog(null, nome); //interface grafica para exibir o nome
        calculaMedia(notaVetor[1], notaVetor[2], notaVetor[3], notaVetor[4]); //chama método calculaMedia com os parametros dos vetores que armazenam as notas
    }
    //fechamento do método lerNota()
    
    //método que calcula a media das notas
    private static void calculaMedia(double a1, double a2, double a3, double a4){
        double media;
        media = (a1+a2+a3+a4)/4; //calculo da media
        //estrutura de decisão que verifica o estado do aluno
        if (media < 3){
            JOptionPane.showMessageDialog(null, "Reprovado " + media); //reprovado
        } else if(media >=3 && media <7){
            JOptionPane.showMessageDialog(null, "Recuperação " + media); //recuperação
        }else{
            JOptionPane.showMessageDialog(null, "Aprovado " + media); //aprovado         
        }
    }
    //fechamento do método calculaMedia()
}
