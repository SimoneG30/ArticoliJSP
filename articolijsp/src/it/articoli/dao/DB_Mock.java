package it.articoli.dao;

import java.util.ArrayList;
import java.util.List;

import it.articoli.model.Articolo;


public class DB_Mock {
	public static final List<Articolo> LISTA_ARTICOLI = new ArrayList<>();

	static {
		LISTA_ARTICOLI.add(new Articolo(1l, "Smartphone", "OnePlus", "Elettronica", 399, "Nord"));
		LISTA_ARTICOLI.add(new Articolo(2l, "Monitor", "Asus", "Elettronica", 300, "MG248Q"));
		LISTA_ARTICOLI.add(new Articolo(3l, "Notebook", "Dell", "Informatica", 750, "Inspiron 5593"));
		LISTA_ARTICOLI.add(new Articolo(4l, "Tastiera", "Logitech", "Informatica", 100, "G512 SE"));
		LISTA_ARTICOLI.add(new Articolo(5l, "Mouse", "Razer", "Informatica", 80, "Naga 2014"));
		LISTA_ARTICOLI.add(new Articolo(6l, "Console", "Sony", "Elettronica", 499, "PlayStation 5"));
		LISTA_ARTICOLI.add(new Articolo(7l, "Case", "NZXT", "Informatica", 99, "S340 Elite"));
	}
}