
package com.mycompany.janelacolorida;

import javax.swing.*;
import java.awt.*;

//@author Admin

public class JanelaColorida extends JFrame {
    public JanelaColorida(){
        super("Janela Colorida");
        Container tela = getContentPane();
        tela.setBackground(new Color(145,209,252));
        //tela.setBackground(Color.blue);
        setSize(600, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        JanelaColorida app = new JanelaColorida();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
