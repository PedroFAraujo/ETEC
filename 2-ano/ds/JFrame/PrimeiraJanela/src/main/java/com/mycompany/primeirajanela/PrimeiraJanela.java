
package com.mycompany.primeirajanela;

import javax.swing.*;

//@author Admin

public class PrimeiraJanela extends JFrame {
    public PrimeiraJanela(){
        super("Primeira Janela");
        setSize(300, 150);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        PrimeiraJanela app = new PrimeiraJanela();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
