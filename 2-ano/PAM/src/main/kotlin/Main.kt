import java.util.Scanner
fun main() {
    val teclado = Scanner(System.`in`)
    print("Digite seu nome: ")
    val nome = teclado.next()
    println("Olá, $nome")

    val teste = """
        aqui pode-se escrever
        inumeras linhas de texto
    """.trimIndent()
    println(teste)

    val b1 = true
    val b2 = false
    val c1 = b1.and(b2)
    val c2 = b1.or(b2)
    val c3 = b1.not()
    println("$c1 $c2 $c3")

    val arrayInt= arrayOf(1,2,3,4)
    val x = arrayInt[2]
    println("Posição do vetor 2: $x")
}