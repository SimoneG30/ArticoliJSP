package it.articoli.service;

import it.articoli.dao.MyDaoFactory;
import it.articoli.service.articolo.ArticoloService;
import it.articoli.service.articolo.ArticoloServiceImpl;

public class MyServiceFactory {

	private static ArticoloService ARTICOLO_SERVICE_INSTANCE;

	public static ArticoloService getArticoloServiceInstance() {
		if (ARTICOLO_SERVICE_INSTANCE == null)
			ARTICOLO_SERVICE_INSTANCE = new ArticoloServiceImpl();

		ARTICOLO_SERVICE_INSTANCE.setArticoloDAO(MyDaoFactory.getArticoloDAOInstance());

		return ARTICOLO_SERVICE_INSTANCE;
	}
}
