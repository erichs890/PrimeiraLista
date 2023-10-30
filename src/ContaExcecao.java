class ContaExcecao extends Exception {
    private double saldoAtual;

    public ContaExcecao(String mensagem, double saldoAtual) {
        super(mensagem);
        this.saldoAtual = saldoAtual;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }
}
