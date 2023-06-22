fun main() {
    //Leitura do salário inicial do funcionário
    print("Digite o salário do funcionário: ")
    val salario = readLine()!!.toDouble()

    //calculo do aumento do salario inicial de 15%
    val aumento = salario * 0.15
    val salarioComAumento = salario + aumento

    //calculo do desconto de 8% de impostos em cima do salario com aumento
    val descontoImpostos = salarioComAumento * 0.08
    val salarioFinal = salarioComAumento - descontoImpostos

    //impressão dos resultados
    println("Salário inicial: R$ $salario")
    println("Salário com aumento: R$ $salarioComAumento")
    println("Salário final após desconto de impostos: R$ $salarioFinal")
}