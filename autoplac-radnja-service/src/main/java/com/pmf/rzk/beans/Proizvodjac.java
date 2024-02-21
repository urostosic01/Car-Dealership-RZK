package com.pmf.rzk.beans;

public class Proizvodjac {
	private String godOsnivanja;
	private String naziv;
	private String sediste;
	
	public Proizvodjac() {
	}
	
	public Proizvodjac(int idProizvodjac, String godOsnivanja, String naziv, String sediste) {
		super();
		this.godOsnivanja = godOsnivanja;
		this.naziv = naziv;
		this.sediste = sediste;
	}

	public String getGodOsnivanja() {
		return godOsnivanja;
	}

	public void setGodOsnivanja(String godOsnivanja) {
		this.godOsnivanja = godOsnivanja;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSediste() {
		return sediste;
	}

	public void setSediste(String sediste) {
		this.sediste = sediste;
	}
	
}
