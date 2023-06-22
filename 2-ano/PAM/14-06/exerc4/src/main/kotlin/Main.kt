fun main(args: Array<String>) {
    println("Exercício 4")

    //Leitura do nome e atribuindo a variável
    print("Digite seu nome: ");
    val nome = readLine()?.toString()!!;

    //Leitura da idade e atribuindo a variável
    print("Digite sua idade: ");
    val idade = readLine()?.toInt()!!;

    //Calculo dos dias que a pessoa ja viveu
    val dias = idade*365;

    //Impressão dos resultados
    println("$nome viveu $dias dias");
}