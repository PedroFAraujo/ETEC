
package com.mycompany.janelafixa;

import javax.swing.*;

//@author Admin

public class JanelaFixa extends JFrame {
    public JanelaFixa(){
        super("Janela Fixa");
        setSize(300, 150);
        setVisible(true);
        setResizable(false);
    }
    
    public static void main(String[] args) {
        JanelaFixa app = new JanelaFixa();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
