
public class Ingresso {

	private double valor;

	public Ingresso() {

	}

	public Ingresso(double valor) {

		this.valor = valor;

	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return this.valor;
	}

	@Override
	public String toString() {
		return "Ingresso - Valor: R$ " + String.format("%.2f", getValor() );
	}
}
