fun main(args: Array<String>) {
    println("Exercício 4")
    print("Digite seu nome: ");
    val nome = readLine()?.toString()!!;
    print("Digite sua idade: ");
    val idade = readLine()?.toInt()!!;
    val dias = idade*365;
    println("$nome viveu $dias dias");
}