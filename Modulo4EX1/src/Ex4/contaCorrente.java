package Ex4;

import java.util.Scanner;

public class contaCorrente {
    Scanner ler = new Scanner(System.in);
    private double numeroConta,saldo,valorRecebido;
    private String nomeCorrentista;


    public void setSaldo() {
        this.saldo = saldo;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }
    public void getSaldo(){
        System.out.println("Informe a quantidade do saldo");
       saldo = ler.nextDouble();
        System.out.println("===============");
    }
    public void depositoConta(){
        System.out.println("Digite o valor que vc quer depositar: ");
        valorRecebido = ler.nextDouble();
        valorRecebido += saldo;
    }
    public double saqueConta (){
        saldo -= valorRecebido;
        return saldo;
    }
}
