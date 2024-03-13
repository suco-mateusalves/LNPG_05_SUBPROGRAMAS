import java.util.Scanner;
// Soma núumeros
public class atividade2 {
    public static int somaRecursiva(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + somaRecursiva(n - 1);
        }
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        long inicio = System.currentTimeMillis(); // Captura o tempo de início

        int soma = somaRecursiva(n);

        long fim = System.currentTimeMillis(); // Captura o tempo de término
        long tempoDecorrido = fim - inicio; // Calcula o tempo decorrido
        System.out.println("A soma dos números de 1 a " + n + " é: " + soma);
        System.out.println("Tempo decorrido (milissegundos): " + tempoDecorrido);
        scanner.close();
    }
}
