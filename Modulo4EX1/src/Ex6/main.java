package Ex6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        quadrado quadrado = new quadrado();
        Scanner ler = new Scanner(System.in);
        double novoValor = 0;
        double A = 0;
        A = (quadrado.getB() * quadrado.getH());
        System.out.println("Calculo: " + A);
        System.out.println("=============");

        System.out.println("Deseja mudar o valor? --- sim --- não ---");
        String mudar = ler.next();


        if (mudar.equals("sim")) {
            System.out.println("Base ou altura?");
            String valor = ler.next();
            if (valor.equals("Base")) {
                A = (quadrado.mudarBase() * quadrado.getH());
                System.out.println("Valor modificado: " + A);
            } else if (valor.equals("altura")) {
                A = (quadrado.getB() * quadrado.mudarAltura());
                System.out.println("Valor modificado: " + A);
            } else if (mudar.equals("não")) {
                return;
            }
        }
    }
}