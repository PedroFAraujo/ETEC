
fun main(args: Array<String>) {
    print("Digite o primeiro número: ")
    val x = readLine()?.toDouble()!!
    print("Digite o segundo número: ")
    val n = readLine()?.toDouble()!!
    val result = Math.pow(x*n, 2.toDouble())
    println("(x*n)^2 = $result")
}