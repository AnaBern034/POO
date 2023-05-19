package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        Scanner ler = new Scanner(System.in);
        String debito = "debito";
        String credito = "credito";


        System.out.println("==========================");
        System.out.println(" SALDO ATUAL " + caixa.getSaldo());
        System.out.println("===========================");
        System.out.print("Digite a opção crédito ou debito ");
        String opcao = ler.next();

        if (opcao.equals(credito)) {
            System.out.println(caixa.setCredito() + caixa.somarSaldo());
        } else if (opcao.equals(debito)) {
            System.out.println(caixa.setDebito()-caixa.subtrairSaldo());
        } else {
            System.out.println("Invalido");
            return;
        }
    }
}
