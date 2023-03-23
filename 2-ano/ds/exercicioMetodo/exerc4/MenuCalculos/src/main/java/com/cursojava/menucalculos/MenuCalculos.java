
package com.cursojava.menucalculos;

//@author Pedro

import javax.swing.JOptionPane;

 
public class MenuCalculos{

    static void Menu(){
        int calc = Integer.parseInt(JOptionPane.showInputDialog("Informe uma cálculo: \n[1]Soma\n[2]Subtração\n[3]Divisão\n[4]Multiplicação\n[5]Resto da Divisão\n[6]Dobro\n[7]Quadrado\n[8]Cubo\n[9]Raiz Quadrada\n[0]Sair")); 
        if (calc == 0){
            switch (calc){
                case 0:
                    System.exit(0);
                    break;
            }
        } else if (calc == 6 || calc == 7 || calc == 8 || calc == 9){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")); 
            switch (calc){
                case 6:
                    float dobro = (num * 2);
                    JOptionPane.showMessageDialog(null, num + " * 2 = " + dobro);
                    break;
                case 7:
                    double quadrado = Math.pow(num,2);
                    JOptionPane.showMessageDialog(null, num + " * " + num + " = " + quadrado);
                    break;
                case 8:
                    double cubo = Math.pow(num,3);
                    JOptionPane.showMessageDialog(null, num + " * " + num + " * " + num + " = " + cubo);
                    break;
                case 9:
                    double sqrt = Math.sqrt(num);
                    JOptionPane.showMessageDialog(null, "Raíz quadrada de " + num + " = " + sqrt);
                    break;
            }
        } else{
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: ")); 
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: ")); 
            
            switch (calc){
                case 1:
                    int soma = (num1 + num2);
                    JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + soma);
                    break;
                case 2: 
                    int sub = (num1 - num2);
                    JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + sub);
                    break;
                case 3:
                    float div = (num1 / num2);
                    JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + div);
                    break;
                case 4:
                    float mult = (num1 * num2);
                    JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + mult);
                    break;
                case 5:
                    int restoDiv = (num1 % num2);
                    JOptionPane.showMessageDialog(null, num1 + " % " + num2 + " = " + restoDiv);
                    break;
                default:
                    System.out.println("Número inválido");
            }
        }
        
        
    }
    
    public static void main(String[] args) {
        Menu();
    }
}
