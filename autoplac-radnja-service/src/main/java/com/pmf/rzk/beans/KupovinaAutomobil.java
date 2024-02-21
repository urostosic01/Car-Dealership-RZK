package com.pmf.rzk.beans;


public class KupovinaAutomobil {
	private int kolicina;
	private Automobil automobil;
	private Kupovina kupovina;
	
	public KupovinaAutomobil() {
	}
	
	public KupovinaAutomobil(int kolicina, Automobil automobil, Kupovina kupovina) {
		super();
		this.kolicina = kolicina;
		this.automobil = automobil;
		this.kupovina = kupovina;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	public Automobil getAutomobil() {
		return automobil;
	}
	public void setAutomobil(Automobil automobil) {
		this.automobil = automobil;
	}
	public Kupovina getKupovina() {
		return kupovina;
	}
	public void setKupovina(Kupovina kupovina) {
		this.kupovina = kupovina;
	}
}
