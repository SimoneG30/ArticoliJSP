package it.articoli.dao.articolo;

import java.sql.Connection;
import java.util.List;

import it.articoli.dao.IBaseDAO;
import it.articoli.model.Articolo;

public interface ArticoloDAO extends IBaseDAO<Articolo> {

	public void setConnection(Connection connection);
	public List<Articolo> findByMarcaEModello(String marca, String modello);
}
