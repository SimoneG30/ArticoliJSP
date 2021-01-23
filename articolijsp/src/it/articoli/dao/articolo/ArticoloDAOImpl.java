package it.articoli.dao.articolo;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.articoli.dao.DB_Mock;
import it.articoli.model.Articolo;

public class ArticoloDAOImpl implements ArticoloDAO {

	private Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<Articolo> findByMarcaEModello(String marca, String modello) {
		List<Articolo> result = new ArrayList<>();

		for (Articolo articoloItem : DB_Mock.LISTA_ARTICOLI) {
			if (articoloItem.getMarca().startsWith(marca) && articoloItem.getModello().startsWith(modello))
				result.add(articoloItem);
		}
		return result;
	}

	@Override
	public List<Articolo> list() throws Exception {
		List<Articolo> result = new ArrayList<>();

		for (Articolo articoloItem : DB_Mock.LISTA_ARTICOLI) {
			result.add(articoloItem);
		}
		return result;
	}

	@Override
	public Articolo get(Long id) throws Exception {
		Articolo result = new Articolo();

		for (Articolo articoloItem : DB_Mock.LISTA_ARTICOLI) {
			if (articoloItem.getIdArticolo().equals(id))
				result = articoloItem;
		}
		return result;
	}

	@Override
	public int update(Articolo input) throws Exception {
		for (Articolo articoloItem : DB_Mock.LISTA_ARTICOLI) {
			if (articoloItem.getIdArticolo().equals(input.getIdArticolo()))
				input.setIdArticolo(articoloItem.getIdArticolo());
			articoloItem = input;

		}
		return 1;

	}

	@Override
	public int insert(Articolo input) throws Exception {
		Long contatore = (long) DB_Mock.LISTA_ARTICOLI.size();
		input.setIdArticolo(contatore);
		DB_Mock.LISTA_ARTICOLI.add(input);
		return 1;
	}

	@Override
	public int delete(Articolo input) throws Exception {

		for (Articolo articoloItem : DB_Mock.LISTA_ARTICOLI) {
			if (articoloItem.getIdArticolo().equals(input.getIdArticolo()))
				DB_Mock.LISTA_ARTICOLI.remove(input);
		}
		return 1;
	}

}
