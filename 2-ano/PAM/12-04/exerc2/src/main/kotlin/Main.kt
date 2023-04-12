fun main(args: Array<String>) {
    print("Digite seu peso: ")
    val peso = readLine()?.toDouble()!!
    print("Digite sua altura: ")
    val altura = readLine()?.toDouble()!!
    val imc = peso/(altura*altura)
    if(imc < 18){
        println("Magreza")
    }else if(imc>18 && imc<25){
        println("Saudável")
    }else if(imc>=25 && imc<30){
        println("Sobrepeso")
    }else if(imc >=30){
        println("Obesidade")
    }
}