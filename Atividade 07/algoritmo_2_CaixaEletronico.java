import java.util.Scanner;

public class algoritmo_2_CaixaEletronico {
    static double saldo = 1000.00;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Caixa Eletrônico");
        exibirSaldo();
        exibirMenu();
        scanner.close();
    }

    static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Consultar Saldo");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                realizarSaque();
                break;
            case 2:
                realizarDeposito();
                break;
            case 3:
                exibirSaldo();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    static void realizarSaque() {
        System.out.println("Digite o valor do saque:");
        double valor = scanner.nextDouble();
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
            exibirSaldo();
        }
    }

    static void realizarDeposito() {
        System.out.println("Digite o valor do depósito:");
        double valor = scanner.nextDouble();
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
        exibirSaldo();
    }

    static void exibirSaldo() {
        System.out.println("Seu saldo atual é: R$" + saldo);
    }
}
