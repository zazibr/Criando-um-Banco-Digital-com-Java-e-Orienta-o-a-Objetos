public class Main {
    public static void main(String[] args) {
        Cliente gustavo = new Cliente();
        gustavo.setNome("Gustavo");

        Conta contaCorrente = new ContaCorrente(gustavo);
        Conta contaPoupanca = new ContaPoupanca(gustavo);

        Banco banco = new Banco();
        banco.getContas().add(contaCorrente);
        banco.getContas().add(contaPoupanca);

        contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);

        

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        System.out.println(banco.listarClientes());
    }
}
