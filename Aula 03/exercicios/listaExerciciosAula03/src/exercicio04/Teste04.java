package exercicio04;

public class Teste04 {
    public static void main(String[] args) {
        ex04 conta = new ex04("12345-6", 1000.0);

        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.sacar(1500.0);

        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}
