 //@author Pedro

public class MenuCalculadora {
    //criacao dos atributos 
    private Calculadora calculadora;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
   
    //metodo construtor que realiza a instancia dos objetos
    public MenuCalculadora(){
        this.calculadora = new Calculadora();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
    }
    
    //metodo executarCalculadora que executa os metodos executarMenuPrincipal e avaliarOpcaoEscolhida enquanto a opcao for diferente de 0
    public void executarCalculadora(){
        do{
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }while(this.opcao!=0);
    }
    
    //metodo que mostra o menu da calculadora, o input da entrada de dados 
    private void executarMenuPrincipal(){
        String mensagemMenu = "Selecione uma opção "
            +"\n 1 - Somar"
            +"\n 2 - Subtrair"
            +"\n 3 - Multiplicar"
            +"\n 4 - Dividir"
            +"\n 5 - Sair";
        String entradaDados = io.entradaDados(mensagemMenu); 
        this.opcao = conversor.StringToInt(entradaDados); //conversao da string da opcao do calculo para inteiro 
    }
    
    //metodo que verifica se a opcao escolhida esta entre 1 e 4 e diferente de 0, se sim vai armazenar os valores e efetuar o calculo da opcao escolhida
    public void avaliarOpcaoEscolhida(){
        String saida;
        double num1 = 0, num2 = 0;
        if(this.opcao != 0 && this.opcao <= 4){
            String mensagemEntrada = "Digite o 1º número: ";
            num1 = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
            calculadora.setNumero01(num1);
            String mensagemEntradea = "Digite o 2º número: ";
            num2 = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
            calculadora.setNumero02(num2);
        }
        
        switch(this.opcao){
            case 1:
                calculadora.somar(num1,num2);
                saida = "Resultado da soma: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
            case 2:
                calculadora.subtrair(num1,num2);
                saida = "Resultado da subtração: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
            case 3:
                calculadora.multiplicar(num1,num2);
                saida = "Resultado da multiplicação: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
            case 4:
                calculadora.dividir(num1,num2);
                saida = "Resultado da divisão: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
            case 5:
                calculadora.sair();
            default:
                io.saidaDados("Opção Inválida");
                break;
        }
    }
}
