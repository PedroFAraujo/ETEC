<?php

require_once("pessoa.class.php");

class Teste{
    private $pessoa;

    public function __construct(){
        $pessoa = new Pessoa();

        $pessoa->setNome($_POST['nome']);
        echo $pessoa->getNome();
        echo "<br>";
        $pessoa->setTelefone($_POST['telefone']);
        echo $pessoa->getTelefone();
        echo "<br>";        
        $pessoa->setOrigem($_POST['origem']);
        echo $pessoa->getOrigem();
        echo "<br>";
        $pessoa->setData($_POST['date']);
        echo $pessoa->getData();
        echo "<br>";
        $pessoa->setObservacao($_POST['obs']);
        echo $pessoa->getObservacao();
    }
}new Teste();

?>