package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CreditMetier;

public class ControllerServlet extends HttpServlet {

	private CreditMetier creditMetier;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		creditMetier = new CreditMetier();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("mod", new CreditModel());
		request.getRequestDispatcher("vueCredit.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { /// TODO Auto-generated method stub

		double credit = Double.parseDouble(request.getParameter("credit"));
		double taux = Double.parseDouble(request.getParameter("taux"));
		int dure = Integer.parseInt(request.getParameter("dure"));
		CreditModel model = new CreditModel();
		model.setCredit(credit);
		model.setTaux(taux);
		model.setDure(dure);

		double ress = creditMetier.calculMensualite(credit, dure, taux);
		model.setMensualite(ress);
		request.setAttribute("mod", model);

		// forward vers la vue
		request.getRequestDispatcher("vueCredit.jsp").forward(request, response);

	}

}
