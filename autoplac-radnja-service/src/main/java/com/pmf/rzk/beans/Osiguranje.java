package com.pmf.rzk.beans;

import java.util.Date;

public class Osiguranje {
	private Date datumKraja;
	private Date datumPocetka;
	private int premija;
	private String vrstaOsiguranja;
	private Clan clan;
	private KupovinaAutomobil kupovinaautomobil;
	
	public Osiguranje() {

	}
	
	public Osiguranje(Date datumKraja, Date datumPocetka, int premija, String vrstaOsiguranja, Clan clan,
			KupovinaAutomobil kupovinaautomobil) {
		super();
		this.datumKraja = datumKraja;
		this.datumPocetka = datumPocetka;
		this.premija = premija;
		this.vrstaOsiguranja = vrstaOsiguranja;
		this.clan = clan;
		this.kupovinaautomobil = kupovinaautomobil;
	}
	
	public Date getDatumKraja() {
		return datumKraja;
	}
	public void setDatumKraja(Date datumKraja) {
		this.datumKraja = datumKraja;
	}
	public Date getDatumPocetka() {
		return datumPocetka;
	}
	public void setDatumPocetka(Date datumPocetka) {
		this.datumPocetka = datumPocetka;
	}
	public int getPremija() {
		return premija;
	}
	public void setPremija(int premija) {
		this.premija = premija;
	}
	public String getVrstaOsiguranja() {
		return vrstaOsiguranja;
	}
	public void setVrstaOsiguranja(String vrstaOsiguranja) {
		this.vrstaOsiguranja = vrstaOsiguranja;
	}
	public Clan getClan() {
		return clan;
	}
	public void setClan(Clan clan) {
		this.clan = clan;
	}
	public KupovinaAutomobil getKupovinaautomobil() {
		return kupovinaautomobil;
	}
	public void setKupovinaautomobil(KupovinaAutomobil kupovinaautomobil) {
		this.kupovinaautomobil = kupovinaautomobil;
	}
}
