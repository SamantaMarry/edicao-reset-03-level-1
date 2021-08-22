// 1) Array de 5 posições

cores = ['azul', 'verde', 'rosa', 'vermelho', 'roxo']
index = [0]

for (index=0; index < cores.length; index++){
    console.log(cores[index])
}

// 2) Array média aritmética

num = [1,2,3,4,5,6,7,8,9,10] // 10 posições de array

soma = 0
for (index = 0; index < num.length; index++) {
    soma += num[index] 
}

media = soma / num.length
console.log(media)

// 3) 60 nomes

meuNome = 'Laura'

nomeComun = false

nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"]

for(index = 0; index < nomesComuns.length; index++) {
    if(meuNome == nomesComuns[index]){
        nomeComun = true
        break
    }

}

if (nomeComun) {
    console.log('É, nome comum :P')
}else{
    console.log('Diferentão, hein?')
}
