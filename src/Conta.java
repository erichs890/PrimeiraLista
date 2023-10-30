public class Conta {
    private double saldo;
    private double limite;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void saca(double valor) throws ContaExcecao {
        if (valor > (saldo + limite)) {
            throw new ContaExcecao("Saldo insuficiente para saque de: " + valor, saldo);
        }
        this.saldo -= valor;
    }


}
