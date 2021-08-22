peso = 150
altura = 1.66

IMC = peso / ( altura * altura)

classificacao = ''
grau = 0

if ( IMC < 18.50) {
    classificacao = 'Magreza'

}else if ( IMC < 25) {
    classificacao = 'Normal'

}else if ( IMC < 30) {
    classificacao = 'Sobrepeso'

}else if ( IMC < 40) {
    classificacao = 'Obesidade'

}else {
    classificacao = 'Obesidade grave'
}
console.log('seu IMC é de ', IMC)
console.log('Você é considerado ', classificacao)

switch (classificacao){
    case 'Sobrepeso':
        console.log('Cuidado! Você está acima do peso recomendado pela OMS. ')
      break

    case 'Obesidade':
        console.log('Cuidado! Você está acima do peso recomendado pela OMS. ')
      break  

    case 'Obesidade grave':
        console.log('Cuidado! Você está acima do peso recomendado pela OMS. ')
        console.log('É importante procurar um médico para avaliar sua saúde.')
      break   
}

