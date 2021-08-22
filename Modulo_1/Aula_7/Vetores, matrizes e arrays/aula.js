// vetor = array 
matriz = []

matriz [0] = 'Marcio'
matriz [1] = 'Enzo'
matriz [2] = 'Valentina'
matriz [4] = 'Iury'

console.log(matriz[1])

// --------------------------------------------------------

matriz = []

matriz [0] = ['Marcio', 'Valentina', 'Joana', 'Enzo']
matriz [1] = [1, 2, 3, 4]

console.log(matriz)

// --------------------------------------------------------

alunos = ['Marcio', 'Valentina', 'Joana', 'Enzo']

notas = [[5.6,7.2],[9.1,8.4],[5.8,4.6],[4.5,8.5]]

alunoSelecionado = 3

nomeDoAluno = alunos[alunoSelecionado]
notasDoAluno = notas[alunoSelecionado]

nota1 = notasDoAluno[0]
nota2 = notasDoAluno[1]

media = (nota1 + nota2) / 2

console.log(nomeDoAluno)
console.log('A primeira nota foi: ', nota1)
console.log('A segunda nota foi: ', nota2)
console.log('Sua média foi', media)

