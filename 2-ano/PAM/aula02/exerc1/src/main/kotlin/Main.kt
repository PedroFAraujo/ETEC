
fun main(args: Array<String>) {
    print("Digite a base do retângulo: ")
    val base = readLine()?.toDouble()!!
    print("Digite a altura do retângulo: ")
    val altura = readLine()?.toDouble()!!
    val area = base*altura
    println("Área do retângulo = $area")
}