
public class Ingressovip extends Ingresso {

	private double adicional;

    public Ingressovip() {
    }

    public Ingressovip(double valor, double adicional) {
        super(valor); // Envia o valor base para a superclasse Ingresso
        this.adicional = adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public double getAdicional() {
        return this.adicional;
    }

    // Método que calcula e RETORNA o valor total (valor base + adicional)
    public double getValorTotal() {
        return getValor() + this.adicional;
    }

    @Override
    public String toString() {
        // Agora chamamos o método getValorTotal() que retorna um double
        return "Ingresso VIP - Valor Total: R$ " + String.format("%.2f", getValorTotal());
    }

}
