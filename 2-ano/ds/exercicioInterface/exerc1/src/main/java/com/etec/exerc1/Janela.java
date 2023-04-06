package com.etec.exerc1;

import javax.swing.*;

//@author Pedro

public class Janela extends JFrame {
    public Janela(){
        super ("Programação Orientada a Objeto"); //titulo
        setSize(450,250); //tamanho
        setVisible(true); //visivel
        setLocationRelativeTo(null); //centralizado
        setResizable(false); //fixo
    }
    
    public static void main(String[] args) {
        Janela app = new Janela();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
