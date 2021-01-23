package it.articoli.service.articolo;

import java.util.List;

import it.articoli.dao.articolo.ArticoloDAO;
import it.articoli.model.Articolo;


public interface ArticoloService {

	public void setArticoloDAO(ArticoloDAO articoloDAO);
	public List<Articolo> cercaPerMarcaEModello(String marca, String modello) throws Exception;
	public List<Articolo> listaArticoli() throws Exception;
	public Articolo prendiUnoDaId(Long id) throws Exception;
	public int modificaArticolo(Articolo articoloInput) throws Exception;
	public int aggiungiArticolo(Articolo articoloInput) throws Exception;
	public int eliminaArticolo(Articolo articoloInput) throws Exception;
}
