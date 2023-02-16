/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.idade;

import javax.swing.JOptionPane;

/**
 *
 * @author PEDRO
 */
public class main {
    public static void main(String[] args) {
        int ano_a = 0, ano_n = 0, idade = 0, idade2050 = 0;
        ano_a = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        ano_n = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que você nasceu: "));
        idade = (ano_a - ano_n);
        idade2050 = (2050 - ano_n);
        JOptionPane.showMessageDialog(null, "Sua idade é " + idade);
        JOptionPane.showMessageDialog(null, "Sua idade em 2050 será: " + idade2050);
    }
}
