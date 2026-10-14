package BancoMercantil;

public class SettersGetters {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		c1.setNumConta(5896);
		c1.setSaldo(9000);
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Nathanael");
		cliente1.setTelefone("38 99999-5896");
		
		c1.setTitular(cliente1);
		
		System.out.println(c1.getNumConta());
		System.out.println("Saldo em conta: R$ " + c1.getSaldo());
		System.out.println("Titular: " + c1.getTitular().getNome());
	

	}
	
	
	

}
