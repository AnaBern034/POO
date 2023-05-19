package Ex1;

import java.util.Scanner;

public class Caixa {
    Scanner ler = new Scanner(System.in);
     public double credito,debito;
     private double saldo;

     public double getSaldo(){
         return saldo;
     }

    public double setCredito() {
        System.out.println("Digite a entrada do valor a ser exibido");
        double entrada = ler.nextDouble();
        return entrada;
    }

    public double setDebito() {
        System.out.println("Digite quanto vc quer tirar: ");
        double saida = ler.nextDouble();
        return saida;
    }

    public double somarSaldo (){
        double soma = credito + saldo;
        System.out.println("==============");
        System.out.println("SALDO ATUAL: ");
        return soma;

    }

    public double subtrairSaldo (){
        double subtracao= saldo - debito;
        return subtracao;
    }
}
