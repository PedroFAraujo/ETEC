fun main(args: Array<String>) {

    print("Digite a quantidade de camisetas pequenas que deseja comprar: ");
    val pequena = readLine()?.toInt()!!;
    val pequenaPreco = pequena*10

    print("Digite a quantidade de camisetas médias que deseja comprar: ");
    val media = readLine()?.toInt()!!;
    val mediaPreco = media*12

    print("Digite a quantidade de camisetas grandes que deseja comprar: ");
    val grande  = readLine()?.toInt()!!;
    val grandePreco = grande*15

    val precoTotal = pequenaPreco+mediaPreco+grandePreco

    println("Preço de camisas pequenas: $pequenaPreco \nPreço de camisas médias: $mediaPreco\nPreço de camisas grandes: $grandePreco\nPreço total: R$$precoTotal")
}