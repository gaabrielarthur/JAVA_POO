
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ingresso c1 = new Ingresso(1000.00);
		
		c1.setValor(20.00);
		System.out.println("Ingresso: " + "R$" + c1.getValor());
		
		Ingressovip c2 = new Ingressovip();
		
	
		c2.setValor(30);
		
		System.out.println("Ingresso vip: " + "R$"+ c2.getValor());
		System.out.println("Valor adicional: " + "R$"+ c2.getAdicional());
		
		Ingresso ingressoNormal = new Ingresso(50.0);
        System.out.println(ingressoNormal); // Chama automaticamente o toString()

        // Teste do Ingresso VIP
        Ingressovip ingressoVIP = new Ingressovip(50.0, 30.0);
        System.out.println(ingressoVIP); // Exibe o valor do ingresso + adicional (R$ 80.00)
	}
	

}
