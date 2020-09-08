package exercicios_pratica.lista_03.Quest_05_06;

public class Estoque {
    
    String nome;
    int qtdAtual;
    int qtdMinima;

    public Estoque() {

    }

    public Estoque( String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public void mudarNome(String nome) {
        
    }

    public void mudarQtdMinima(int qtdMinima) {

    }

    public void repor(int qtd) {
        this.qtdAtual += qtd;
    }

    public void darBaixa(int qtd) {
        this.qtdAtual -= qtd;
    }

    public String mostra() {
        return "Nome:  " + this.nome + " | " + "Quantidade Atual: " + this.qtdAtual;
    }

    public boolean precisaRepor() {
        if(this.qtdAtual < this.qtdMinima) {
            return true;
        } else {
            return false;
        }
    }
        
    
}
