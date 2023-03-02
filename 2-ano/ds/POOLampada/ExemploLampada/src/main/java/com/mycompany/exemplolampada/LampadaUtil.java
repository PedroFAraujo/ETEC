/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplolampada;

/**
 *
 * @author Pedro
 */
public class LampadaUtil {
    
    //declarando o objeto estadoLampada, como apagada
    private String estadoLampada = "apagada";
    
    //declaração do metodo apaga(), atribuindo o valor estadoLampada = acesa
    public void acende(){
        estadoLampada = "acesa";
    }
    
    //declaração do metodo apaga(), atribuindo o valor estadoLampada = apagada
    public void apaga(){
        estadoLampada = "apagada";
    }
    
    //declaração do metodo mostraEstado()
    public void mostraEstado(){
        //se o estadoLampada for acesa, irá retornar "A lâmpada está acesa", senao irá retornar "A lâmpada está apagada"
        if (estadoLampada.equals("acesa")){
            System.out.println("A lâmpada está acesa");
        } else{
            System.out.println("A lâmpada está apagada");
        }
    }
    
}
