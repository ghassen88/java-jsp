package metier;

public class TestMetier {

	public static void main(String[] args) {
		CreditMetier creditMetier = new CreditMetier();
		double m = creditMetier.calculMensualite(150, 14, 2.5);
		System.out.println(m);
	}

}
