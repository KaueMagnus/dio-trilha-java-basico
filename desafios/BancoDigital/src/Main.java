public class Main {
    public static void main(String[] args) {

        Cliente kaue = new Cliente();
        kaue.setNome("Kaue");

        Conta cc = new ContaCorrente(kaue);
        Conta poupanca = new ContaPoupanca(kaue);

        cc.depositar(250);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
