package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        String bola2=null;
        Bola bola = new Bola ();
        bola.setBola1();
        System.out.println("======================");
        bola.setBola2(bola2);

        System.out.println("Digite uma cor para trocar");
        String novaCor= ler.next();
        bola.trocaCor(novaCor);
        bola.mostraCor();

    }
}
