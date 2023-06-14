
fun main() {

    print("Digite o dia: ");
    val dia = readLine()?.toInt()!!;

    print("Digite o mes: ");
    val mes = readLine()?.toInt()!!;

    val diferenca = 30*(mes-1)+dia;

    println("$dia/$mes")
    print("Dias desde o começo do ano: $diferenca")

}