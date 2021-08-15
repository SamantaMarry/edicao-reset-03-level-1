// função

function atravessar () {
    console.log('Olhar para a esquerda');
    console.log('Olhar para a direita');
    console.log('Olhar para a esperar');
    console.log('Olhar para a atravessar');
    console.log('------------------');

}

atravessar()
atravessar()
atravessar()
atravessar()

// -------------------------------------------------------------------

// argumentos

function imprimir(i){ // nº inteiro
    console.log(i);
}

imprimir(5)

function imprimir(i){
    console.log(i*2); // imprimir o dobro (2x)
}

imprimir(7)
imprimir(5) 

// função dentro da outra 

function multiplicar (a,b) {
    imprimir(a*b)
}

multiplicar(1,2)

// retorno

function multiplicar(a,b){
    return a*b
}

var resultado = multiplicar(3,5)

imprimir(resultado)