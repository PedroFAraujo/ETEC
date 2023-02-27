<?php

//Criação de Variável
$a = 0;

//Sistema de Decisão
$b = 10;
if ($b <= 10){
    echo "O valor da variável B é maior ou igual a 10 <br>";
}else{
    echo "O valor da variável B  é menor que 10 <br>";
}

//Laços de Repetição
for ($i = 0; $i <=10; $i++){
    echo "Laço de repetição for " . $i . "<br>";
}

$x = 0;
while($x <= 10){
    echo "Laço de repetição while " . $x . "<br>";
    $x++;
}

$y = 0;
do{
    echo "Laço de repetição do while " . $y . "<br>";
    $y++;
}while($y <= 10);

?>