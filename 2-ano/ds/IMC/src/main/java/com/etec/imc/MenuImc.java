
package com.etec.imc;

// @author Pedro

import javax.swing.JOptionPane;


public class MenuImc {
    private Situacao situacao;
    private IMC imc;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    
     //metodo construtor que realiza a instancia dos objetos
    public MenuImc(){
        this.situacao = new Situacao();
        this.opcao = -1;
        this.imc = new IMC();
        this.conversor = new ConversorNumeros();
         this.io = new EntradaSaidaDados();
    }
    
    //metodo executarImc que executa os metodos executarMenuPrincipal e avaliarOpcaoEscolhida enquanto a opcao for diferente de 0
    public void executarImc(){
        do{
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }while(this.opcao!=0);
    }
    
    private void executarMenuPrincipal(){
        String mensagemMenu = "Selecione uma opção "
            +"\n 1 - Cadastrar Peso e Altura"
            +"\n 2 - Consultar Dados Cadastrados"
            +"\n 3 - Calcular IMC"
            +"\n 4 - Vefificar Situação"
            +"\n 5 - Sair";
        String entradaDados = io.entradaDados(mensagemMenu); 
        this.opcao = conversor.stringToInt(entradaDados); //conversao da string da opcao do calculo para inteiro 
    }
    
     //metodo que verifica se a opcao escolhida esta entre 1 e 4 e diferente de 0, se sim vai armazenar os valores e efetuar o calculo da opcao escolhida
    public void avaliarOpcaoEscolhida(){
        String saida;
        double peso = 0, altura = 0;
        if(this.opcao != 0 && this.opcao <= 4){
            String mensagemEntrada = "Digite o peso: ";
            peso = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
            imc.setPeso(peso);
            String mensagemEntradea = "Digite a altura: ";
            altura = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
            imc.setAltura(altura);
        }
        
        switch(this.opcao){
            case 1:
                imc.cadastrarDados(peso, altura);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Peso: " + imc.getPeso());
                JOptionPane.showMessageDialog(null, "Altura: " + imc.getAltura());
                break;
            
            default:
                io.saidaDados("Opção Inválida");
                break;
        }
    }
    
}
