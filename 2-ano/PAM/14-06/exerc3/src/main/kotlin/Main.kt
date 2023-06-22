fun main(args: Array<String>) {
    println("Exercício 3");

    //Leitura do mes e atribuindo a variavel
    print("Digite um número correspondente a um mês: ");
    val mes = readLine()?.toInt()!!;

    //switch case para verificar o mes correspondente
    val mesString = when(mes) {
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

    //Impressao do resultado
    println(mesString);
}