package it.articoli.dao.articolo;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
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
			if (articoloItem.getMarca().toLowerCase().startsWith(marca.toLowerCase()) && articoloItem.getModello().toLowerCase().startsWith(modello.toLowerCase()))
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
		
		Iterator<Articolo> iteratoreLista = DB_Mock.LISTA_ARTICOLI.iterator();

		while (iteratoreLista.hasNext()) {
		    Articolo articoloEstratto = iteratoreLista.next();

		    if (articoloEstratto.getIdArticolo().equals(input.getIdArticolo()))
		    	iteratoreLista.remove();
		}
		
		return 1;
	}

}
