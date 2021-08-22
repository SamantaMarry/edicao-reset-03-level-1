
nota1 = 8.0
nota2 = 8.0

media = (nota1 + nota2) / 2

if (media >= 7.0) {
    console.log('Voce foi aprovado com a média ' + media + '!!')
    console.log('Parabéns')
}

else {
    console.log('Você foi Reprovado!')
    console.log('Até o próximo ano.')    
}    

console.log ('----------------------------------------------------------------------------------------')

nota1 = 8.0
nota2 = 10.0

media = (nota1 + nota2) / 2

conceito = ''

if (media <= 4.0){
    conceito = 'Ruim'
}
else if (media <= 6.0) {
    conceito = 'Regular'
}
else if (media <= 8.00){
    conceito = 'Bom'
}
else{

    conceito = 'Ótimo'
}

console.log('Sua média foi ' + media + '!!')
console.log('Sua conceito foi ' + conceito + '!!')

switch (conceito){
    case 'Ruim':
        console.log('Precisa estudar mais!')
       break
       
    case 'Regular':
        console.log('Está quase lá!')
       break   
    
    case 'Bom':
        console.log('Continue assim!')
       break  
       
    case 'Ótimo':
        console.log('Mandou muito bem!!')
       break  
}