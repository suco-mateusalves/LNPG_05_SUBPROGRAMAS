# LNPG_05_SUBPROGRAMAS
Subprogramas (Funções, Procedimentos e Métodos)

## Atividade 01

- Crie um programa que recebe como parâmetro o caminho para um arquivo texto
- O programa deve ler este arquivo texto e imprimir:
- Quantas palavras existem no arquivo
- A(s) palavra(s) com mais caracteres 
- Qual a vogal que mais aparece
- Caso tenha o literal “ção”  no texto, informar a linha onde ocorre a primeira aparição
### Regras
- Escolha a linguagem
- O programa deve ser quebrado em subprogramas (funções/procedimentos)
- Use parâmetros em ao menos 1 subprograma
- Use return em ao menos 1 subprograma

## Atividade 02

Dado o programa abaixo em Java, substitua o loop iterativo por recursão:
```java
import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 a " + n + " é: " + soma);
        scanner.close();
    }
}
```

```java
// Calcule o tempo decorrido para grandes valores
long inicio = System.currentTimeMillis();
… 
long fim = System.currentTimeMillis();
long tempoDecorrido = fim - inicio;
```
