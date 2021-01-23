package it.articoli.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.articoli.model.Articolo;
import it.articoli.service.MyServiceFactory;


@WebServlet("/RimozioneServlet")
public class RimozioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RimozioneServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = null;
		String idArticoloDaEliminare = request.getParameter("idArticoloRimozione");
		Long idArticoloDaModificareParsato = null;
		try {
			if (!idArticoloDaEliminare.isEmpty()) {
				idArticoloDaModificareParsato = Long.parseLong(idArticoloDaEliminare);
				Articolo articoloDaEliminare =  MyServiceFactory.getArticoloServiceInstance().prendiUnoDaId(idArticoloDaModificareParsato);
				request.setAttribute("articoloEliminato", MyServiceFactory.getArticoloServiceInstance().eliminaArticolo(articoloDaEliminare));
				destinazione = "searchArticolo.jsp";
				String rimozioneRiuscita = "Articolo rimosso correttamente";
				request.setAttribute("rimozioneRiuscita", rimozioneRiuscita);
				RequestDispatcher rd = request.getRequestDispatcher(destinazione);
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
