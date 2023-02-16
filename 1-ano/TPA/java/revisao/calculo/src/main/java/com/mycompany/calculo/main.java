/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculo;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class main {
    public static void main(String[] args) {
        double x = 0, n = 0, res = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número"));
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número"));
        res = (Math.pow((x*n), 2));
        JOptionPane.showMessageDialog(null, "O resultado é: " + res);
    }
}
