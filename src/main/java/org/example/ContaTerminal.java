package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nPor favor, digite o número da Conta!");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite a Agencia: ");
        agencia = sc.nextLine();

        System.out.println("Digite o Nome do Cliente:");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o Saldo: ");
        saldo = sc.nextBigDecimal();

        System.out.println("\n\n");

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco," +
                        " sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numero, saldo);

    }
}