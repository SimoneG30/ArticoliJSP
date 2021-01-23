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

@WebServlet("/ModificaServlet")
public class ModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ModificaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = null;
		Integer prezzoDaModificareParsato = 0;
		Long idArticoloDaModificareParsato = null;
		String idArticoloDaModificare = request.getParameter("idArticolo");
		String marcaDaModificare = request.getParameter("marcaInput");
		String modelloDaModificare = request.getParameter("modelloInput");
		String prezzoDaModificare = request.getParameter("prezzoInput");
		String categoriaDaModificare = request.getParameter("categoriaInput");
		String descrizioneDaModificare = request.getParameter("descrizioneInput");
		if (!prezzoDaModificare.isEmpty()) {
			prezzoDaModificareParsato = Integer.parseInt(prezzoDaModificare);
		}

		if (!idArticoloDaModificare.isEmpty()) {
			idArticoloDaModificareParsato = Long.parseLong(idArticoloDaModificare);
		}

		destinazione = "searchArticolo.jsp";

		try {
			if (!prezzoDaModificare.isEmpty()) {
				// mi carico abitante grazie ad id
				Articolo articoloAggiornato = MyServiceFactory.getArticoloServiceInstance()
						.prendiUnoDaId(idArticoloDaModificareParsato);
				// con l-abitante caricato faccio il set di tutti i campi visibili nel form
				articoloAggiornato.setMarca(marcaDaModificare);
				articoloAggiornato.setModello(modelloDaModificare);
				articoloAggiornato.setPrezzo(prezzoDaModificareParsato);
				articoloAggiornato.setCategoria(categoriaDaModificare);
				articoloAggiornato.setDescrizione(descrizioneDaModificare);
				// a quel punto posso passare l-oggetto in questione al modifica del service
				request.setAttribute("articoloModificato",
						MyServiceFactory.getArticoloServiceInstance().modificaArticolo(articoloAggiornato));

			} else {

				Articolo articoloAggiornato = MyServiceFactory.getArticoloServiceInstance()
						.prendiUnoDaId(idArticoloDaModificareParsato);
				articoloAggiornato.setMarca(marcaDaModificare);
				articoloAggiornato.setModello(modelloDaModificare);
				articoloAggiornato.setCategoria(categoriaDaModificare);
				articoloAggiornato.setDescrizione(descrizioneDaModificare);
				request.setAttribute("articoloModificato",
						MyServiceFactory.getArticoloServiceInstance().modificaArticolo(articoloAggiornato));
			}
			String updateRiuscito = "Campi modificati correttamente";
			request.setAttribute("updateRiuscito", updateRiuscito);
			RequestDispatcher rd = request.getRequestDispatcher(destinazione);
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
