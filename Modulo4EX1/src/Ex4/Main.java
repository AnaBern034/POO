package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        contaCorrente conta = new contaCorrente();
        Scanner ler = new Scanner(System.in);

        conta.getSaldo();

        System.out.println("Você que depoistar ou sacar");
        String opcao = ler.next();
        if (opcao.equals("depositar")){
            System.out.println();

        }


    }
}
