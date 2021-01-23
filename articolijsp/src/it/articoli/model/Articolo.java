package it.articoli.model;

public class Articolo {

	private Long idArticolo;
	private String descrizione;
	private String marca;
	private String categoria;
	private int prezzo;
	private String modello;

	public Articolo() {

	}

	public Articolo(String marca, String modello) {
		super();
		this.marca = marca;
		this.modello = modello;
	}

	public Articolo(Long idArticolo, String descrizione, String marca, String categoria, int prezzo, String modello) {
		super();
		this.idArticolo = idArticolo;
		this.descrizione = descrizione;
		this.marca = marca;
		this.categoria = categoria;
		this.prezzo = prezzo;
		this.modello = modello;
	}

	public Articolo(String descrizione, String marca, String categoria, int prezzo, String modello) {
		super();
		this.descrizione = descrizione;
		this.marca = marca;
		this.categoria = categoria;
		this.prezzo = prezzo;
		this.modello = modello;
	}
	
	

	public Articolo(String descrizione, String marca, String categoria, String modello) {
		super();
		this.descrizione = descrizione;
		this.marca = marca;
		this.categoria = categoria;
		this.modello = modello;
	}

	public Long getIdArticolo() {
		return idArticolo;
	}

	public void setIdArticolo(Long idArticolo) {
		this.idArticolo = idArticolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

}
