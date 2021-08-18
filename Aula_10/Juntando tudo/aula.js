// Variaveis -----------------------------------

var niveis = ['Muito abaixo do peso',
              'Abaixo do peso',
              'Peso normal',
              'Acima do peso',
              'Obesidade Grau I', 
              'Obesidade Grau II',
              'Obesidade Grau III',]

var pessoas = ['Samanta', 'Iury', 'Ana', 'Jessica']
var massas = [73,80,50,180]
var alturas = [1.66,1.80,1.60,1.50]

// Funções--------------------------------------- 

function calcularIMC(massa,altura){

    var imc = massa/(altura ** 2)

    return imc

}

function verificaNivel(imc){

    var nivel = 0

if(imc < 17){
  nivel = 0
} else if(imc < 18.5){
  nivel = 1   
} else if(imc < 25){
  nivel = 2
} else if(imc < 30){
  nivel = 3
} else if(imc < 35){
  nivel = 4   
} else if(imc < 40){
  nivel = 5
} else{
  nivel = 6
}

return nivel
     
}

// Execução do código

for (var indice = 0; indice < pessoas.length; indice++){


var pessoa = pessoas[indice]
var massa = massas[indice]
var altura = alturas[indice]

var imc = calcularIMC(massa,altura)
var nivel = verificaNivel(imc)

console.log('Nome: ' + pessoa)
console.log('Massa: ' + massa)
console.log('Altura: ' + altura)
console.log('IMC: ' + imc.toFixed(2))
console.log('Estado: ' + niveis[nivel])
console.log('------------------------------------')

}