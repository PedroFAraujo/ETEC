
package com.mycompany.imglabel;

import javax.swing.*;
import java.awt.*;

//@author Pedro

public class Main extends JFrame{
    JLabel imagem;
    public Main(){
        super("JLabel com Imagem"); //título janela
        Container tela = getContentPane(); //criação container
        ImageIcon icone = new ImageIcon("icon.png");
        setIconImage(icone.getImage());
        imagem = new JLabel(icone);
        tela.add(imagem);
        setSize(600, 600);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        Main app = new Main();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
