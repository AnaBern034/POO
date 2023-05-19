package Ex2;


public class Bola {
     String cor,marca,material;
    private double velocidade,circunferencia;
    private String bola1;
    private String bola2;

    public void setbola(String bola1){
        this.cor = cor;
        this.marca=marca;
        this.circunferencia=circunferencia;
        this.material=material;
        this.velocidade=velocidade;

    }
        public void setBola1() {
            System.out.println("As caracteristicas da Bola1 são: ");
            cor = "vermelho";
            System.out.println("cor "+cor);

            marca = " NIKE";
            System.out.println("marca: "+ marca);

            circunferencia = 70;
            System.out.println("circunferencia: "+ circunferencia+"cm");

            velocidade = 30;
            System.out.println("velocidade: "+velocidade+"m/s");
        }

    public void setBola2(String bola2) {
        this.bola2 = bola2;
        System.out.println("As caracteristicas da Bola2 são: ");

        cor = "laranja";
        System.out.println("cor " + cor);

        marca = "ADDIDAS";
        System.out.println("marca: " + marca);

        circunferencia = 68;
        System.out.println("circunferencia: " + circunferencia + "cm");

        velocidade = 30;
        System.out.println("velocidade: " + velocidade + "m/s");
    }
        public void trocaCor(String novaCor) {
            cor = novaCor;
        }
        public void mostraCor() {
        System.out.println("A cor da bola é: " + cor);

    }

    }