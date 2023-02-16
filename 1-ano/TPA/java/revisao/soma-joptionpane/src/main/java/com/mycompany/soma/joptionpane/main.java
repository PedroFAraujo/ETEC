/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soma.joptionpane;
import javax.swing.JOptionPane;
/**
 *
 * @author PEDRO
 */
public class main {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0, r = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número "));
        r = (a * b) + (a * c) + (a * d);
        JOptionPane.showMessageDialog(null, "O resultado é: " + r);
        
    }
}
