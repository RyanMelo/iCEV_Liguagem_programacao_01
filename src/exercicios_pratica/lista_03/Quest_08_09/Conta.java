package exercicios_pratica.lista_03.Quest_08_09;

public class Conta {
    
    String nomeTitular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;
    
    public Conta(String nome, int numero, String agencia, double saldo, String dataAbertura){
        this.nomeTitular = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public double saca(double valorSacado) {
        return this.saldo -= valorSacado;
    }

    public double despositar(double valorDepositado) {
        return this.saldo += valorDepositado;
    }

    public double redimento() {
        return this.saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
        String impressao = "\nNOME: " + this.nomeTitular + "\nNumero: " + this.numero + "\nAgência: " + this.agencia + "\nSaldo: " + this.saldo + "\nRedimento: " + this.redimento() + "\nData de Ambertura: " + this.dataAbertura + "\n";
        return impressao;
    }

}
