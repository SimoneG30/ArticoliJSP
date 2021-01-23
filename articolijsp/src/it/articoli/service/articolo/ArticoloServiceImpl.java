package it.articoli.service.articolo;

import java.util.List;

import it.articoli.dao.articolo.ArticoloDAO;
import it.articoli.model.Articolo;

public class ArticoloServiceImpl implements ArticoloService {

	private ArticoloDAO articoloDAO;

	public void setArticoloDAO(ArticoloDAO articoloDAO) {
		this.articoloDAO = articoloDAO;
	}

	@Override
	public List<Articolo> cercaPerMarcaEModello(String marca, String modello) throws Exception {
		return articoloDAO.findByMarcaEModello(marca, modello);
	}

	@Override
	public List<Articolo> listaArticoli() throws Exception {
		return articoloDAO.list();
	}

	@Override
	public Articolo prendiUnoDaId(Long id) throws Exception {
		return articoloDAO.get(id);
	}

	@Override
	public int modificaArticolo(Articolo articoloInput) throws Exception {
		articoloDAO.update(articoloInput);
		return 1;
	}

	@Override
	public int aggiungiArticolo(Articolo articoloInput) throws Exception {
		articoloDAO.insert(articoloInput);
		return 1;
	}

	@Override
	public int eliminaArticolo(Articolo articoloInput) throws Exception {
		articoloDAO.delete(articoloInput);
		return 1;
	}

}
