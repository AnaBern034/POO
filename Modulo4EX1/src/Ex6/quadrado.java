package Ex6;

import java.util.Scanner;

public class quadrado {
    Scanner ler = new Scanner(System.in);
   private double tamanho,A,b,h;


    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getH() {
        System.out.println("Digite a altura do quadrado: ");
        h = ler.nextDouble();
        return h;
    }

    public double getB() {
    System.out.println("Digite o valor da base: ");
    b = ler.nextDouble();
    this.b = b;
    return b;
    }

    public double mudarBase() {
        System.out.println("Digite um novo valor para base: ");
        double novoValorB = ler.nextDouble();
        return novoValorB;
    }
    public double mudarAltura() {
        System.out.println("Digite um novo valor para altura: ");
        double novoValorH = ler.nextDouble();
        return novoValorH;
}
}
