#include <stdio.h>

void imprimirResultado(float resultado) {
    printf("Resultado: %.2f\n", resultado);
}

void imprimirErroDivisaoPorZero() {
    printf("Erro! Divisão por zero.\n");
}

float soma(float num1, float num2) {
    float resultado = num1 + num2;
    imprimirResultado(resultado);
    return resultado;
}

float subtracao(float num1, float num2) {
    float resultado = num1 - num2;
    imprimirResultado(resultado);
    return resultado;
}

float multiplicacao(float num1, float num2) {
    float resultado = num1 * num2;
    imprimirResultado(resultado);
    return resultado;
}

float divisao(float num1, float num2) {
    float resultado;
    if (num2 != 0) {
        resultado = num1 / num2;
        imprimirResultado(resultado);
    } else {
        imprimirErroDivisaoPorZero();
        resultado = 0;
    }
    return resultado;
}

char obterOperador() {
    char operador;
    printf("Digite a operação (+, -, *, /): ");
    scanf(" %c", &operador); // espaço antes de %c para consumir o caractere de nova linha pendente
    return operador;
}

void obterOperandos(float *num1, float *num2) {
    printf("Digite o primeiro número: ");
    scanf("%f", num1);
    printf("Digite o segundo número: ");
    scanf("%f", num2);
}

void imprimirOperadorInvalido() {
    printf("Operador inválido.\n");
}

int main() {
    char operador;
    float num1, num2, resultado;

    operador = obterOperador();
    obterOperandos(&num1, &num2);

    switch (operador) {
        case '+':
            resultado = soma(num1, num2);
            break;
        case '-':
            resultado = subtracao(num1, num2);
            break;
        case '*':
            resultado = multiplicacao(num1, num2);
            break;
        case '/':
            resultado = divisao(num1, num2);
            break;
        default:
            imprimirOperadorInvalido();
    }

    return 0;
}
