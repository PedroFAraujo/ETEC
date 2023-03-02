/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplolampada;

/**
 *
 * @author Pedro
 */
public class ExemploLampada {
    
    //pacote do nucleo java
    public static void main(String[] args) {
        
        //instancia o objeto lampada a partir da classe LampadaUtil
        LampadaUtil lampada = new LampadaUtil();
        
        //objeto lampada está chamando o metodo acende
        lampada.acende();
        
        //objeto lampada está chamando o metodo apaga
        lampada.apaga();
        
        //objeto lampada está chamando o metodo mostraEstado
        lampada.mostraEstado();
        
    }
}
