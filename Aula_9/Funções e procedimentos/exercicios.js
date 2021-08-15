// 1) função imprimir

function imprimir (i){
    console.log(i)
}

imprimir(5)

// 2) função da aula 5

// A) mesmo nome

function mesmoNome(a,b) {
    return a == b
}

var resultado = mesmoNome ('samanta', 'iury')

console.log(resultado)

// B) maior idade

function maiorIdade(i){
    return i >= 18
}

var maiorDeIdade = maiorIdade(20)

console.log(maiorDeIdade)

// C) valor com juros

function valorComJuros(i){
    return i * 1.1
}

var valor = valorComJuros(100.00)

console.log(valor)

// D) média aritmética


function mediaAritimetica(itens){
    soma = 0

    for (index = 0; index < itens.length; index++) {
        soma += itens[index] 
    }
    return soma / itens.length
}

imprimir (mediaAritimetica([1]))
imprimir (mediaAritimetica([1, 4, 10]))
imprimir (mediaAritimetica([1, 2, 3, 4, 5]))

// E) Margem Bruta

function margemBruta(receitaLiquidaVendas, custoProdutosVendidos) {
    lucroBruto = receitaLiquidaVendas - custoProdutosVendidos
    return (lucroBruto / receitaLiquidaVendas) * 100
}

imprimir (margemBruta(1000000, 500000))
imprimir(margemBruta(528459.11, 632501.87))

