package com.pmf.rzk.beans;

public class Automobil {
	private int cena;
	private int godiste;
	private String gorivo;
	private String karoserija;
	private int kubikaza;
	private int snaga;
	private Model model;
	
	public Automobil() {
	}

	public Automobil(int cena, int godiste, String gorivo, String karoserija, int kubikaza, int snaga,
			Model model) {
		super();
		this.cena = cena;
		this.godiste = godiste;
		this.gorivo = gorivo;
		this.karoserija = karoserija;
		this.kubikaza = kubikaza;
		this.snaga = snaga;
		this.model = model;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public String getGorivo() {
		return gorivo;
	}

	public void setGorivo(String gorivo) {
		this.gorivo = gorivo;
	}

	public String getKaroserija() {
		return karoserija;
	}

	public void setKaroserija(String karoserija) {
		this.karoserija = karoserija;
	}

	public int getKubikaza() {
		return kubikaza;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}

	public int getSnaga() {
		return snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

}
