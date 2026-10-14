package BancoMercantil;

public class Cliente {

	private String cpf;
	private String nome;
	private String telefone;
	private static int cont;

	// pra que serve
	// tantos códigos?
	// se a vida não é programada
	// e as melhores coisas
	// não tem lógica

	// Ass: Gabriel Arthur

	// construtor sem parametro
	public Cliente() {
		cont++;
	}

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		cont++;

	}

	public void setCpf(String num) {
		this.cpf = num;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public static int qtdCliente() {
		 return cont++;
	}
}
