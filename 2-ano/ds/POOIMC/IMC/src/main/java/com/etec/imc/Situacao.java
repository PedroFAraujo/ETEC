package com.etec.imc;

// @author Pedro
 
public class Situacao {
    private String situacao;
    
    public Situacao(String situacao){
        this.situacao = situacao;
    }
    
    public Situacao(){
        this("");
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public void VerificarSituacao(IMC p){
        if(p.getImc() < 18.5){
            setSituacao("Baixo peso");
        }else if(p.getImc() > 18.5 && p.getImc() <= 24.9){
            setSituacao("Peso Normal");
        }else if(p.getImc() > 24.9 && p.getImc() <= 29.9){
            setSituacao("Sobrepeso");
        }else if(p.getImc() > 29.9 && p.getImc() <= 34.9){
            setSituacao("Obesidade");
        }else if(p.getImc() > 34.9 && p.getImc() <= 39.9){
            setSituacao("Obesidade ModeradaI");
        }else if(p.getImc() > 39.9 && p.getImc() <= 49.9){
            setSituacao("Obesidade Mórbida l");
        }else if(p.getImc() > 50){
            setSituacao("Superobesidade");
        }
    }
    
}
