package Ex4;

import java.util.Scanner;

public class contaCorrente {
    Scanner ler = new Scanner(System.in);
    private double numeroConta,saldo,valorRecebido;
    private String nomeCorrentista;


    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }
    public double getSaldo(){
        System.out.println("Informe a quantidade do saldo");
       saldo = ler.nextDouble();
        System.out.println("===============");
        return saldo;
    }
    public double depositoConta(){
        System.out.println("Digite o valor que vc quer depositar: ");
        valorRecebido = ler.nextDouble();
        double calculoResultado = 0 ;
        calculoResultado = valorRecebido + saldo;
        System.out.println("===========");
        System.out.println("SALDO TUAL: "+ calculoResultado);
        System.out.println("============");
        System.out.println(calculoResultado);
        return calculoResultado;

    }
    public double saqueConta (){
        System.out.println("Digite o valor que vc quer sacar: ");
        valorRecebido = ler.nextDouble();
        double calculoResultado = 0 ;
        calculoResultado= saldo - valorRecebido;
        System.out.println("===========");
        System.out.println("SALDO TUAL: "+ calculoResultado);
        System.out.println("============");
        return calculoResultado;
    }
}
