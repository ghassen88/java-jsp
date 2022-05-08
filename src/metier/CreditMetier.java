package metier;

public class CreditMetier {

	public double calculMensualite(double credit, int dure, double taux) {

		double t = taux / 100;
		double t1 = credit * t / 12;
		double t2 = 1 - Math.pow((1 + t / 12), -1 * dure);
		return t1 / t2;
	}

}
