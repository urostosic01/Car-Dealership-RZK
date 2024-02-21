package com.pmf.rzk.beans;

import java.util.Date;


public class Kupovina {
	private Date datumKupovine;
	private String napomena;
	private Clan clan;
	
	public Kupovina() {
	}
	
	public Kupovina(Date datumKupovine, String napomena, Clan clan) {
		super();
		this.datumKupovine = datumKupovine;
		this.napomena = napomena;
		this.clan = clan;
	}
	
	public Date getDatumKupovine() {
		return datumKupovine;
	}
	public void setDatumKupovine(Date datumKupovine) {
		this.datumKupovine = datumKupovine;
	}
	public String getNapomena() {
		return napomena;
	}
	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}
	public Clan getClan() {
		return clan;
	}
	public void setClan(Clan clan) {
		this.clan = clan;
	}
	
	
}
