fun main(args: Array<String>) {
    print("Digite o horario de seu turno: ")
    val horario = readLine()?.toDouble()!!
    var turno:String = ""
    if(horario >= 5 && horario<13){
        turno = "Matutino"
    }else if(horario>=13 && horario<21){
        turno = "Vespertino"
    }else if(horario>=21 || horario <5){
        turno = "Noturno"
    }
    println("Turno: $turno")
}