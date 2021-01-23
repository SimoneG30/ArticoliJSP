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

@WebServlet("/AggiuntaServlet")
public class AggiuntaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AggiuntaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = null;
		Integer prezzoDaAggiungereParsato = 0;
		Long idArticoloDaAggiungereParsato = null;
		String idArticoloDaAggiungere = request.getParameter("idArticolo");
		String marcaDaAggiungere = request.getParameter("marcaInput");
		String modelloDaAggiungere = request.getParameter("modelloInput");
		String prezzoDaAggiungere = request.getParameter("prezzoInput");
		String categoriaDaAggiungere = request.getParameter("categoriaInput");
		String descrizioneDaAggiungere = request.getParameter("descrizioneInput");
		if (!prezzoDaAggiungere.isEmpty()) {
			prezzoDaAggiungereParsato = Integer.parseInt(prezzoDaAggiungere);
		}

		if (!idArticoloDaAggiungere.isEmpty()) {
			idArticoloDaAggiungereParsato = Long.parseLong(idArticoloDaAggiungere);
		}

		destinazione = "searchArticolo.jsp";

		try {
			if (!prezzoDaAggiungere.isEmpty()) {
				// mi carico abitante grazie ad id
				Articolo articoloNuovo = MyServiceFactory.getArticoloServiceInstance()
						.prendiUnoDaId(idArticoloDaAggiungereParsato);
				// con l-abitante caricato faccio il set di tutti i campi visibili nel form
				articoloNuovo.setMarca(marcaDaAggiungere);
				articoloNuovo.setModello(modelloDaAggiungere);
				articoloNuovo.setPrezzo(prezzoDaAggiungereParsato);
				articoloNuovo.setCategoria(categoriaDaAggiungere);
				articoloNuovo.setDescrizione(descrizioneDaAggiungere);
				// a quel punto posso passare l-oggetto in questione al modifica del service
				request.setAttribute("articoloNuovo",
						MyServiceFactory.getArticoloServiceInstance().aggiungiArticolo(articoloNuovo));

			} else {

				Articolo articoloNuovo = MyServiceFactory.getArticoloServiceInstance()
						.prendiUnoDaId(idArticoloDaAggiungereParsato);
				articoloNuovo.setMarca(marcaDaAggiungere);
				articoloNuovo.setModello(modelloDaAggiungere);
				articoloNuovo.setCategoria(categoriaDaAggiungere);
				articoloNuovo.setDescrizione(descrizioneDaAggiungere);
				request.setAttribute("articoloNuovo",
						MyServiceFactory.getArticoloServiceInstance().aggiungiArticolo(articoloNuovo));
			}
			String aggiuntaRiuscita = "Campi modificati correttamente";
			request.setAttribute("aggiuntaRiuscita", aggiuntaRiuscita);
			RequestDispatcher rd = request.getRequestDispatcher(destinazione);
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
