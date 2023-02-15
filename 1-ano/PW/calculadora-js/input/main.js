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

function calcular(){
    var txtn1 = document.querySelector('input#txtn1')
    var txtn2 = document.querySelector('input#txtn2')
    var n1 = Number(txtn1.value)
    var n2 = Number(txtn2.value)
    var aviso = document.querySelector('div#resultado')
    aviso.innerHTML = 'Abra o console'
    var rescalculadora = new Calculadora()
    var ressoma = rescalculadora.somar(n1,n2)
    console.log(`${n1} + ${n2} = ${ressoma}`)
    
    var ressub = rescalculadora.subtrair(n1,n2)
    console.log(`${n1} - ${n2} = ${ressub}`)

    var resmult = rescalculadora.multiplicar(n1,n2)
    console.log(`${n1} * ${n2} = ${resmult}`)

    var resdiv = rescalculadora.dividir(n1,n2)
    console.log(`${n1} / ${n2} = ${resdiv.toFixed(2).replace('.',',')}`)
}   

