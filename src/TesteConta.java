public class TesteConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.deposita(100);
        minhaConta.setLimite(100);

        try {
            minhaConta.saca(1000);
        } catch (ContaExcecao e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
            System.out.println("Saldo atual: " + e.getSaldoAtual());
        }
    }
}
