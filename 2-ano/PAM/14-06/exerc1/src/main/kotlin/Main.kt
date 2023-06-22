fun main(args: Array<String>) {
    println("Exercício 1");

    //Leitura do horario do inicio do trabalho e atribuindo a variável
    print("Digite a hora do início de seu trabalho: ");
    val horario = readLine()?.toDouble()!!;

    //Estrutura de decisão para verificar o turno
    if(horario >= 5 && horario <= 12.59){
        println("Turno Matutino");
    }else if(horario >= 13 && horario <= 20.59){
        println("Turno Vespertino")
    }else if(horario >= 21 || horario <= 4.59){
        println("Turno Noturno")
    }
}