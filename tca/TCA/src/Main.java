import java.util.Scanner;

class ContaBancariaJava { // Renomeada para evitar conflito
    private double saldo;

    // Construtor
    public ContaBancariaJava(String titular, double saldo) {
        this.saldo = saldo;
    }

    // Método para realizar depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para exibir saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria uma nova conta bancária com saldo inicial de R$0.00
        ContaBancariaJava conta = new ContaBancariaJava("João", 0.0);

        // Exibe o saldo inicial
        conta.exibirSaldo();

        // Solicita e realiza o depósito
        System.out.print("Digite o valor a ser depositado: R$");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Exibe o saldo atualizado
        conta.exibirSaldo();

        scanner.close();
    }
}

