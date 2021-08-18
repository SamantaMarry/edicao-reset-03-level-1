// Variaveis ---------------------------------------------------------------------------------------------------------

colaboradores    = ['Rhoger', 'Cléverson', 'Gleysberto', 'Nádio', 'Rosiméri', 'Regislane', 'Agripino', 'Wellison']
idades           = [      69,          66,           58,      61,         60,          64,         59,         55]
temposDeTrabalho = [      31,          29,           30,      26,         25,          24,         26,         29]

// Função--------------------------------------------------------------------------------------------------------------

/* Função para verificar se um colaborador está apto para se aposentar, atendendo a pelo menos uma das seguintes regras:
 * - Ter pelo menos 65 anos de idade;
 * - Ter trabalhado no mínimo 30 anos;
 * - Ter pelo menos 60 anos de idade e 25 anos de trabalho.
 */

function verificarAposentadoria(nome) {
    
    colaborador = false
    idades = 0
    tempoDeTrabalho = 0
    
// buscando um colaborador pelo nome

    for (indice = 0; indice < colaboradores.length; indice++){

        if (nome == colaboradores[indice]) {
            colaborador = true
            idade = idades[indice]
            tempoDeTrabalho = temposDeTrabalho[indice]
        }
    }

// se encontrar o colaborador, verifica as regras de aposentadoria

    if (colaborador) {

        porIdade = (idade >= 65)
        porTempoDeTrabalho = (tempoDeTrabalho >= 30)
        porIdadeETempoDeTrabalho = (idade >= 60 && tempoDeTrabalho >= 25)


        // não importa qual regra seja atendida
        // se qualquer uma for, o colaborador pode se aposentar
        if (porIdade || porTempoDeTrabalho || porIdadeETempoDeTrabalho){
            console.log ("Parabéns, já pode sair de férias eternas :)")
        } else {
            console.log("Infelizmente para você, ainda falta um tempo :(")
        }
    
    } else {
        console.log("Colaborador inválido :|")
    }
}

//Execução do código ----------------------------------------------------------------------------------------------------

verificarAposentadoria('Rosiméri')    // true (regra 3)
verificarAposentadoria('Agripino')    // false (falta 1 ano de idade para regra 3)
verificarAposentadoria('Rhoger')      // true (todas)
verificarAposentadoria('Hudnélson')   // false (colaborador inexistente)
verificarAposentadoria('Gleysberto')  // true (regra 2)
verificarAposentadoria('Regislane')   // false (falta 1 ano de idade para regra 1 e 1 de trabalho para regra 3)
verificarAposentadoria('Cléverson')   // true (regras 1 e 3)
verificarAposentadoria('Nádio')       // true (regra 3)
verificarAposentadoria('Wellison')    // false (falta 1 ano de trabalho para regra 2)
verificarAposentadoria('Florisberto') // false (colaborador inexistente)