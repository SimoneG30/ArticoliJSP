package it.articoli.dao;

import it.articoli.dao.articolo.ArticoloDAO;
import it.articoli.dao.articolo.ArticoloDAOImpl;

public class MyDaoFactory {

	private static ArticoloDAO ARTICOLO_DAO_INSTANCE = null;

	public static ArticoloDAO getArticoloDAOInstance() {
		if (ARTICOLO_DAO_INSTANCE == null)
			ARTICOLO_DAO_INSTANCE = new ArticoloDAOImpl();

		return ARTICOLO_DAO_INSTANCE;
	}
}