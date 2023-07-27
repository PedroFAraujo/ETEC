//@author Pedro

public class Calculadora {
    //criacao dos atributos
    private double numero01;
    private double numero02;
    private double resultado;
    
    //instancia da classe sem parametros
    public Calculadora(){
        this(0,0,0);
    
    }
    //instancia da classe com parametros
    public Calculadora(double numero01, double numero02, double resultado){
        //atribuicao das variaveis do metodo get e atyribuindo ao conteudo das variaveis
        this.numero01 = numero01;
        this.numero01 = numero02;
        this.numero01 = resultado;
    }
    
    //metodos get e set
    /**
     * @return the numero01
     */
    public double getNumero01() {
        return numero01;
    }

    /**
     * @param numero01 the numero01 to set
     */
    public void setNumero01(double numero01) {
        this.numero01 = numero01;
    }

    /**
     * @return the numero02
     */
    public double getNumero02() {
        return numero02;
    }

    /**
     * @param numero02 the numero02 to set
     */
    public void setNumero02(double numero02) {
        this.numero02 = numero02;
    }

    /**
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    //metodos que realizam o calculo com base nos valores dos metodos get 
    public void somar(double numero01, double numero02){
        setResultado(this.getNumero01() + this.getNumero02());
    }
    
    public void subtrair(double numero01, double numero02){
        setResultado(this.getNumero01() - this.getNumero02());
    }
    
    public void multiplicar(double numero01, double numero02){
        setResultado(this.getNumero01() * this.getNumero02());
    }
    
    public void dividir(double numero01, double numero02){
        setResultado(this.getNumero01() / this.getNumero02());
    }
    
    public void sair(){
        System.exit(0);
    }
}
