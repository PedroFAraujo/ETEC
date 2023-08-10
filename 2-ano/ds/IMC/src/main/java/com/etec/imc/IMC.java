package com.etec.imc;

// @author Pedro
 
public class IMC {
    
    private Double peso, altura, imc;
    
    public IMC(Double peso, Double altura, Double imc){
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }
    
    public IMC(){
        this(0.0, 0.0, 0.0);
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * @return the imc
     */
    public Double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(Double imc) {
        this.imc = imc;
    }
    
   public void cadastrarDados(Double peso, Double altura){
       setPeso(peso);
       setAltura(altura);
   }
   
   public double calcularImc(){
       setImc(getPeso() / Math.pow(getAltura(), 2));
       return getImc();
   }
   
}
