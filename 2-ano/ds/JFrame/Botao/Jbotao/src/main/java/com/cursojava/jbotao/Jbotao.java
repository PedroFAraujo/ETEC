package com.cursojava.jbotao;

//@author Pedro

//importação das bibliotecas
import javax.swing.*; 
import java.awt.*;


public class Jbotao extends JFrame{
    JButton novoBtn, abrirBtn, botaoBtn; //criação das variáveis botao que recebe JButton
    ImageIcon icone; //variavel ImageIcon para receber o icone
    
    //criação da função Jbotao para criar a interface gráfica
    public Jbotao(){
        super("Jbutton"); //nome da janela
        Container tela = getContentPane(); //criação do container com o nome tela
        setLayout(null); //limpar objetos da tela
        
        icone = new ImageIcon("img.gif");
        
        //atribuindo valor aos JButton
        novoBtn = new JButton("Novo");
        abrirBtn = new JButton("Abrir", icone);
        botaoBtn = new JButton(icone);
        
        //posicionando os botoes
        //coluna, linha, largura, altura
        novoBtn.setBounds(70, 20, 100, 30);
        abrirBtn.setBounds(70, 70, 100, 30);
        botaoBtn.setBounds(70, 120, 100, 30);
        
        //adicionando os JLabel na tela
        tela.add(novoBtn);
        tela.add(abrirBtn);
        tela.add(botaoBtn);

        setSize(250,210); //atribuindo um tamanho para tela
        setVisible(true); //janela visivel
        setLocationRelativeTo(null); //janela ao centro
        setResizable(false); //janela fixa

    }
    
    public static void main(String[] args) {
        Jbotao app = new Jbotao(); //instancia do objeto
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //opções da janela
    }
}
