package com.pmf.rzk.beans;

public class Clan {
	private String adresa;
	private String brojTelefona;
	private String ime;
	private String korisnickoIme;
	private String prezime;
	private String sifra;
	
	public Clan() {
	}

	public Clan(String adresa, String brojTelefona, String ime, String korisnickoIme, String prezime, String sifra) {
		super();
		this.adresa = adresa;
		this.brojTelefona = brojTelefona;
		this.ime = ime;
		this.korisnickoIme = korisnickoIme;
		this.prezime = prezime;
		this.sifra = sifra;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	
}
