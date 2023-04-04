
package com.mycompany.janelaminimizada;

import javax.swing.*;

//@author Admin

public class JanelaMinimizada extends JFrame {
    public JanelaMinimizada(){
        super("Janela Minimizada");
        setSize(300, 150);
        setVisible(true);
        setExtendedState(ICONIFIED);
    }
    
    public static void main(String[] args) {
        JanelaMinimizada app = new JanelaMinimizada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
