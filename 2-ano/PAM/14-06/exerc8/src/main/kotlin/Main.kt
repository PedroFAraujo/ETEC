fun main(args: Array<String>) {
    print("Digite o salário: ");
    val salario = readLine()?.toDouble()!!;
    val aumento = salario*(15/100);
    val imposto = aumento-(8/100);
    println("Salário Inicial: $salario\nSalário com aumento: $aumento\nSalário final: $imposto");
}