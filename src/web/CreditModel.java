package web;

public class CreditModel {

	private double credit;
	private int dure;
	private double taux;
	private double mensualite;

	public CreditModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditModel(double credit, int dure, double taux, double mensualite) {
		super();
		this.credit = credit;
		this.dure = dure;
		this.taux = taux;
		this.mensualite = mensualite;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public int getDure() {
		return dure;
	}

	public void setDure(int dure) {
		this.dure = dure;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public double getMensualite() {
		return mensualite;
	}

	public void setMensualite(double mensualite) {
		this.mensualite = mensualite;
	}

}
