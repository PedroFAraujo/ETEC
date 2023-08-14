
package com.etec.imc;

// @author Pedro

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
        String opcao = io.entradaDados(mensagemMenu); 
        this.opcao = conversor.stringToInt(opcao); //conversao da string da opcao do calculo para inteiro 
    }
    
     //metodo que verifica a opção escolhida e faz uma ação conforme o número da ação
    public void avaliarOpcaoEscolhida(){
            switch(this.opcao){
                case 1:
                    imc.cadastrarDados(conversor.stringToDouble(io.entradaDados("Digite seu peso: ")), conversor.stringToDouble(io.entradaDados("Digite sua altura: ")));
                    break;
                case 2:
                    io.saidaDados("Peso: " + imc.getPeso() + "\nAltura: " + imc.getAltura());
                    break;
                case 3:
                       imc.calcularImc();
                       io.saidaDados("IMC: " + imc.getImc());
                    break;
                case 4: 
                    situacao.VerificarSituacao(imc);
                    io.saidaDados("Situação: " + situacao.getSituacao());
                    break;
                case 5: 
                    io.saidaDados("Finalizando programa...");
                    System.exit(0);
                default:
                    io.saidaDados("Opção Inválida");
                    break;
        }
    }
    
}
