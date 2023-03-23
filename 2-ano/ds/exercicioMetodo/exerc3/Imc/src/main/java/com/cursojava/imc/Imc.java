
package com.cursojava.imc;

import javax.swing.JOptionPane;

//@author Pedro
 
public class Imc {
        public static void calcularPesoIdeal(){
            double altura = 0.0, peso = 0.0, imc = 0.0;
            altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:  (m)")); 
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:  (kg)")); 
            imc = peso/(Math.pow(altura,2));
            String resultadoIMC = String.format("%.2f", imc);
            JOptionPane.showMessageDialog(null, "Seu IMC é de: " + resultadoIMC);
            
            verificarPesoIdeal(imc);
        }
        
        public static void verificarPesoIdeal(double iMc){
            if (iMc < 18.5){
                JOptionPane.showMessageDialog(null, "Abaixo do peso");
            } else if(iMc >=18.5 && iMc <=24.9 ){
                JOptionPane.showMessageDialog(null,"Peso Normal");
            } else if(iMc >=25 && iMc <=29.9 ){
               JOptionPane.showMessageDialog(null,"Excesso de peso");
            } else if(iMc >=30 && iMc <=34.9 ){
                JOptionPane.showMessageDialog(null,"Obesidade I");
            } else if(iMc >=35 && iMc <=39.9 ){
                JOptionPane.showMessageDialog(null,"Obesidade II");
            } else if(iMc >=40){
                JOptionPane.showMessageDialog(null,"Obesidade III");
            } 
        }
        
        public static void main(String[] args) {
            calcularPesoIdeal();
        }
}
     
