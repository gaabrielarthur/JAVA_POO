package BancoMercantil;


public class TestaReferencia {

	public static void main(String[] args) {

		// ✅ titular agora é um objeto Cliente, não uma String
		Cliente titular1 = new Cliente();
		titular1.setNome("Rogerio Martins");

		Conta conta1 = new Conta();
		conta1.setTitular(titular1); // ✅ usando set
		conta1.setSaldo(5360.00);
		conta1.setAgencia(123);
		conta1.setNumConta(1243);
		conta1.setCvc(111);

		System.out.println("Titular conta 1: " + conta1.getTitular().getNome());
		System.out.println("O saldo em conta é: R$" + conta1.getSaldo());

		// ✅ usando deposita() em vez de acessar saldo direto
		conta1.deposita(500);
		System.out.println("O saldo atual é: R$" + conta1.getSaldo());

		// conta 2
		Cliente titular2 = new Cliente();
		titular2.setNome("Marcela");

		Conta conta2 = new Conta();
		conta2.setTitular(titular2);
		conta2.setSaldo(2840.00);

		System.out.println("Titular da conta 2: " + conta2.getTitular().getNome());
		System.out.println("O saldo atual da conta 2 é: R$" + conta2.getSaldo());

		if (conta1 == conta2) {
			System.out.println("São a mesma conta");
		} else {
			System.out.println("Contas diferentes!");
		}

		conta1.deposita(700);
		System.out.println("Saldo atual conta 1: R$" + conta1.getSaldo());

		conta1.saca(7000);
		System.out.println("O saldo agora é: R$" + conta1.getSaldo());
	}
}
