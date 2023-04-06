
package com.etec.janela_01;

import javax.swing.*;
import java.awt.*;

//@author Pedro

public class Janela_01 extends JFrame{
    public Janela_01(){
        super("Exercício 2"); //titulo
        ImageIcon icone = new ImageIcon("icon.png"); //declarando o icon
        setIconImage(icone.getImage()); //colocando o icon
        Container tela = getContentPane(); //criando container
        tela.setBackground(new Color(125,125,125)); //cor no fundo
        setSize(400, 200); //tamanho
        setVisible(true); //visivel
        setLocationRelativeTo(null); //centralizado
        setExtendedState(MAXIMIZED_BOTH); //maximizado
    }
    
    public static void main(String[] args) {
        Janela_01 app = new Janela_01();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
