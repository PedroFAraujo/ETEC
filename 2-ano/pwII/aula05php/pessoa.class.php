<?php

//Classe
class Pessoa{
    //Atributos
    private $nome;
    private $endereco;
    private $bairro;
    private $cep;
    private $cidade;
    private $estado;

    //metodo GET nome
    public function getNome(){
        return $this -> nome;
    }

    //metodo SET nome
    public function setNome($nome){
        $this -> nome = $nome;
    }

    //metodo GET endereco
    public function getEndereco(){
        return $this -> endereco;
    }

    //metodo SET endereco
    public function setEndereco($endereco){
        $this -> endereco = $endereco;
    }

    //metodo GET bairro
    public function getBairro(){
        return $this -> bairro;
    }

    //metodo SET bairro
    public function setBairro($bairro){
        $this -> bairro = $bairro;
    }

    //metodo GET cep
    public function getCep(){
        return $this -> cep;
    }

    //metodo SET cep
    public function setCep($cep){
        $this -> cep = $cep;
    }

    //metodo GET cidade
    public function getCidade(){
        return $this -> cidade;
    }

    //metodo SET cidade
    public function setCidade($cidade){
        $this -> cidade = $cidade;
    }

    //metodo GET estado
    public function getEstado(){
        return $this -> estado;
    }

    //metodo SET estado
    public function setEstado($estado){
        $this -> estado = $estado;
    }
}

?>