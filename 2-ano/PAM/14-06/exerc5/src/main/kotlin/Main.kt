fun main(args: Array<String>) {
    println("Exercício 5");
    print("Digite o peso do prato montado (kg): ");
    val peso = readLine()?.toDouble()!!;
    val preco = peso*12;
    print("O preço a pagar pelo prato montado é $preco")
}