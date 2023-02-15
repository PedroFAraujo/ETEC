class Calculadora{
    somar(n1,n2){
        return(n1+n2)
    }

    subtrair(n1,n2){
        return(n1-n2)
    }

    multiplicar(n1,n2){
        return(n1*n2)
    }

    dividir(n1,n2){
        return(n1/n2)
    }
}

function somar(){
    var txtn1 = document.querySelector('input#txtn1')
    var txtn2 = document.querySelector('input#txtn2')
    var n1 = Number(txtn1.value)
    var n2 = Number(txtn2.value)
    var conta = document.querySelector('div.conta')
    let calculadora = new Calculadora()
    var resultado = calculadora.somar(n1,n2)
    conta.innerHTML = `${n1} + ${n2} = ${resultado}`
}

function subtrair(){
    var txtn1 = document.querySelector('input#txtn1')
    var txtn2 = document.querySelector('input#txtn2')
    var n1 = Number(txtn1.value)
    var n2 = Number(txtn2.value)
    var conta = document.querySelector('div.conta')
    let calculadora = new Calculadora()
    var resultado = calculadora.subtrair(n1,n2)
    conta.innerHTML = `${n1} - ${n2} = ${resultado}`
}

function multiplicar(){
    var txtn1 = document.querySelector('input#txtn1')
    var txtn2 = document.querySelector('input#txtn2')
    var n1 = Number(txtn1.value)
    var n2 = Number(txtn2.value)
    var conta = document.querySelector('div.conta')
    let calculadora = new Calculadora()
    var resultado = calculadora.multiplicar(n1,n2)
    conta.innerHTML = `${n1} × ${n2} = ${resultado}`
}

function dividir(){
    var txtn1 = document.querySelector('input#txtn1')
    var txtn2 = document.querySelector('input#txtn2')
    var n1 = Number(txtn1.value)
    var n2 = Number(txtn2.value)
    var conta = document.querySelector('div.conta')
    let calculadora = new Calculadora()
    var resultado = calculadora.dividir(n1,n2)
    conta.innerHTML = `${n1} ÷ ${n2} = ${resultado.toFixed(2).replace(".",",")}`
}

function refresh(){
    location.reload()
}