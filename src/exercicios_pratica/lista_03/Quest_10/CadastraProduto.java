package exercicios_pratica.lista_03.Quest_10;

public class CadastraProduto {
    String nome;
    String marca;
    String lote;
    String precoCompra;
    String precoVenda;

    public CadastraProduto(String nome, String marca, String lote, String precoCompra, String precoVenda) {
        this.nome = nome;
        this.marca = marca;
        this.lote = lote;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }

    public void atualizar(String dado, String novoValor) {
        switch (dado) {
            case "nome":
                this.nome = novoValor;
                break;
            
            case "marca":
                this.marca = novoValor;
                break;
                
            case "lote":
                this.lote = novoValor;
                break;
                
            case "preço de compra":
                this.precoCompra = novoValor;
                break;
            
            case "preço de venda":
                this.precoVenda = novoValor;
                break;

            default:
                System.out.println("Este dado não existe, verifique novamente!");
                break;
        }
    }

    public void listarProduto() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Marca: " + this.marca);
        System.out.println("Lote: " + this.lote);
        System.out.println("Preço de Compra: " + this.precoCompra);
        System.out.println("Preço de Venda: " + this.precoVenda);
    }

}
