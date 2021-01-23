package it.articoli.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.articoli.service.MyServiceFactory;



@WebServlet("/PreparaRimozioneServlet")
public class PreparaRimozioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PreparaRimozioneServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long idDaRimuovere = Long.parseLong(request.getParameter("idDaInviareComeParametro"));
		String destinazione = null;

		try {
			request.setAttribute("articoloDaEliminare", MyServiceFactory.getArticoloServiceInstance().prendiUnoDaId(idDaRimuovere));
		} catch (Exception e) {
			e.printStackTrace();
		}
		destinazione = "confermaRimozione.jsp";
		
		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
