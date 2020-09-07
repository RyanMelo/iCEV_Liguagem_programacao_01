package exercicios_pratica.lista_03.Quest_01_02;

public class Lampada {
    
    boolean ligada;

    public void liga() {
        this.ligada = true;
        System.out.println("ligou");
    }

    public void desliga() {
        this.ligada = false;
        System.out.println("desligou");
    }

    public void observar() {
        if(this.ligada == true) {
            System.out.println("está ligada");
        } else {
            System.out.println("está desligada");
        }
    }

}
