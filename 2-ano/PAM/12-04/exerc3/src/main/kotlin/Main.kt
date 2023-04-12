fun main(args: Array<String>) {
    print("Digite um número correspondente ao mês: ")
    val mes =  readLine()?.toInt()!!
    val mesString: String
    mesString = when (mes) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Opção Inválida"
    }
    println(mesString)
}