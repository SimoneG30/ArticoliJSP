package it.articoli.web.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.articoli.service.MyServiceFactory;

@WebServlet("/PreparaModificaServlet")
public class PreparaModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PreparaModificaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long parametroArticoloPerModifica = Long.parseLong(request.getParameter("idDaInviareComeParametro"));
		String destinazione = null;

		try {
			request.setAttribute("articoloAttributeModifica",
					MyServiceFactory.getArticoloServiceInstance().prendiUnoDaId(parametroArticoloPerModifica));

		} catch (Exception e) {
			e.printStackTrace();
		}
		destinazione = "preparaModifiche.jsp";

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
