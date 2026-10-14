package BancoMercantil;

public class Conta {

	// ✅ todos os campos agora são private
	private int numConta;
	private double saldo;
	private int agencia;
	private int cvc;
	private Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	public void transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
		}
	}

	public void setNumConta(int numero) {
		this.numConta = numero;
	}

	public int getNumConta() {
		return this.numConta;
	}

	public void setSaldo(double valor) {
		this.saldo = valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setTitular(Cliente c) {
		this.titular = c;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public int getCvc() {
		return this.cvc;
	}
}
