package com.pmf.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the bankovniracun database table.
 * 
 */
@Entity
@NamedQuery(name="BankovniRacun.findAll", query="SELECT b FROM BankovniRacun b")
public class BankovniRacun implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int brojRacuna;

	private int stanje;

	private String tipRacuna;

	//bi-directional many-to-one association to Clan
	@ManyToOne
	private Clan clan;

	public BankovniRacun() {
	}

	public int getBrojRacuna() {
		return this.brojRacuna;
	}

	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public int getStanje() {
		return this.stanje;
	}

	public void setStanje(int stanje) {
		this.stanje = stanje;
	}

	public String getTipRacuna() {
		return this.tipRacuna;
	}

	public void setTipRacuna(String tipRacuna) {
		this.tipRacuna = tipRacuna;
	}

	public Clan getClan() {
		return this.clan;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

}