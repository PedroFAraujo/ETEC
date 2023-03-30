
package com.mycompany.janelamaximizada;

import javax.swing.*;

//@author Admin

public class JanelaMaximizada extends JFrame {
    public JanelaMaximizada(){
        super("Janela Maximizada");
        setSize(300, 150);
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    public static void main(String[] args) {
        JanelaMaximizada app = new JanelaMaximizada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
