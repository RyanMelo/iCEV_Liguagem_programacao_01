package exercicios_pratica.lista_03.Quest_05_06_07;

public class Main {
    public static void main(String[] args) {
        
        Estoque estoque1 = new Estoque("Impressora jato de tinta", 13, 6);
        Estoque estoque2 = new Estoque("Monitor LCD 17 Pol", 11, 13);
        Estoque estoque3 = new Estoque("Mouse Ótico", 6, 2);

        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(4);

        System.out.println("Estoque 1, precisar repor ? " + (estoque1.precisaRepor() == true ? "Sim" : "Não"));
        System.out.println("Estoque 2, precisar repor ? " + (estoque2.precisaRepor() == true ? "Sim" : "Não"));
        System.out.println("Estoque 3, precisar repor ? " + (estoque3.precisaRepor() == true ? "Sim" : "Não"));
        
        System.out.println("------ INFORMAÇÕES ------");
        
        System.out.println(estoque1.mostra());
        System.out.println(estoque2.mostra());
        System.out.println(estoque3.mostra());

    }
}
