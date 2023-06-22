fun main(args: Array<String>) {
    println("Exercício 2");

    //Leitura do peso e atribuindo a variavel
    print("Digite seu peso: ")
    val peso = readLine()?.toDouble()!!;

    //Leitura da altura e atribuindo a variavel
    print("Digite sua altura: ")
    val altura = readLine()?.toDouble()!!;

    //Calculo do IMC
    val imc = (peso/(altura*altura))

    //Estrutura de decisão para verificar a classificação do IMC
    if(imc < 18){
        println("Magreza")
    }else if(imc >=18 && imc <= 24.9){
        println("Saudável")
    }else if(imc >= 25 && imc <= 29.9){
        println("Sobrepeso")
    }else if(imc >= 30){
        println("Obesidade")
    }
}