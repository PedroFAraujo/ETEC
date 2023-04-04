
package com.mycompany.janelaicone;

import javax.swing.*;
import java.awt.*;

//@author Admin

public class JanelaIcone extends JFrame {
    public JanelaIcone(){
        super("Icone");
        ImageIcon icone = new ImageIcon("shrek.jpg");
        setIconImage(icone.getImage());
        Container tela = getContentPane();
        tela.setBackground(new Color(145,252,163));
        //tela.setBackground(Color.blue);
        setSize(600, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        JanelaIcone app = new JanelaIcone();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
