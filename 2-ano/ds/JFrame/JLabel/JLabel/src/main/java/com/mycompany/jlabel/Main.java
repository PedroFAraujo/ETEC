
package com.mycompany.jlabel;

import javax.swing.*; //importação biblioteca javax.swing
import java.awt.*; //importação biblioteca java.awt

//@author Pedro

public class Main extends JFrame { //criação classe main herdando da JFrame
    JLabel nome, idade, telefone, celular; //atributos JLabel
    
    public Main(){
        super("JLabel"); //nome da janela
        Container tela = getContentPane(); //criação do container
        setLayout(null); //limpar objetos da tela
        
        //atribuindo um valor ao JLabel
        nome = new JLabel("Nome"); 
        idade = new JLabel("Idade"); 
        telefone = new JLabel("Telefone");
        celular = new JLabel("Celular"); 
        
        //posicionando os JLabel na tela e declarando sua largura e comprimento
        nome.setBounds(50,20,80,20); //coluna, linha, largura, comprimento
        idade.setBounds(50,60,80,20);
        telefone.setBounds(50,100,90,20);
        celular.setBounds(50,140,80,20);
        
        //atribuindo a cor dos JLabel
        nome.setForeground(Color.red);
        idade.setForeground(Color.blue);
        telefone.setForeground(new Color(190,152,142));
        celular.setForeground(new Color(201,200,142));
        
        //atribuindo a fonte, peso e tamanho
        nome.setFont(new Font("Arial", Font.BOLD, 14));
        idade.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        telefone.setFont(new Font("Courier New", Font.BOLD, 18));
        celular.setFont(new Font("Times New Roman", Font.BOLD, 20));
        
        //adicionando os JLabel na tela
        tela.add(nome);
        tela.add(idade);
        tela.add(telefone);
        tela.add(celular);
        
        setSize(400,250); //atribuindo um tamanho para tela
        setVisible(true); //janela visivel
        setLocationRelativeTo(null); //janela fixa
    }
    
    public static void main(String[] args) {
        Main app = new Main(); //instancia do objeto
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //opções da janela
    }
}
