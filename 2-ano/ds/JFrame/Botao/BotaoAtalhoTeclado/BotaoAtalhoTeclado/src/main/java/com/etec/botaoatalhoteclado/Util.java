package com.etec.botaoatalhoteclado;

//importação das classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//@author Pedro
 
public class Util extends JFrame{
    //criação dos atributos botões do tipo JButton
    JButton procurarBtn, voltarBtn, proximoBtn, abrirBtn;
    public Util(){
        super("Exemplo com JButton"); //titulo da janela
        Container tela = getContentPane(); //criação do container
        setLayout(null); //limpa o layout para posicionar os elementos
        
        //atribuição do conteúdo dos botões
        procurarBtn = new JButton ("Procurar");
        voltarBtn = new JButton ("Voltar>>");
        proximoBtn = new JButton ("Próximo>>");
        abrirBtn = new JButton ("Abrir");
        
        //atribuição da cor de fundo dos botões
        procurarBtn.setBackground(Color.yellow);
        voltarBtn.setBackground(Color.red);
        proximoBtn.setBackground(Color.blue);
        abrirBtn.setBackground(Color.white);
        
        //atribuição da cor da fonte dos botões
        procurarBtn.setForeground(Color.blue);
        voltarBtn.setForeground(Color.white);
        proximoBtn.setForeground(Color.orange);
        abrirBtn.setForeground(Color.black);
        
        //posicionamento dos botões
        procurarBtn.setBounds(65,20,100,30);
        voltarBtn.setBounds(65,60,100,30);
        proximoBtn.setBounds(65,100,100,30);
        abrirBtn.setBounds(65,140,100,30);
        
        //atribuição das teclas de atalho do teclado nos botões
        procurarBtn.setMnemonic(KeyEvent.VK_P);
        voltarBtn.setMnemonic(KeyEvent.VK_V);
        proximoBtn.setMnemonic(KeyEvent.VK_X);
        abrirBtn.setMnemonic(KeyEvent.VK_S);
        
        //adiciona os botões na tela (container)
        tela. add(procurarBtn);
        tela.add(voltarBtn);
        tela.add(proximoBtn);
        tela.add(abrirBtn);
        
        setSize(250, 250); //tamanho da janela
        setVisible(true); //janela visivel
        setLocationRelativeTo(null); //janela ao centro
        setResizable(false); //janela fixa
    }
}