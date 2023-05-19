package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        contaCorrente conta = new contaCorrente();
        Scanner ler = new Scanner(System.in);


        System.out.println("Você que depoistar ou sacar");
        String opcao = ler.next();
        if (opcao.equals("depositar")){
            conta.getSaldo();
            conta.depositoConta();
        } else if (opcao.equals("sacar")) {
            conta.getSaldo();
            conta.saqueConta();
        } else {
            System.out.println("INVÁLIDO");
            return;
        }
    }
}
