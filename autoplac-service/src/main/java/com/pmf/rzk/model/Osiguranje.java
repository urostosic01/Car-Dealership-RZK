package com.pmf.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;


/**
 * The persistent class for the osiguranje database table.
 * 
 */
@Entity
@NamedQuery(name="Osiguranje.findAll", query="SELECT o FROM Osiguranje o")
public class Osiguranje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idServis;

	@Temporal(TemporalType.DATE)
	private Date datumKraja;

	@Temporal(TemporalType.DATE)
	private Date datumPocetka;

	private int premija;

	private String vrstaOsiguranja;

	//bi-directional many-to-one association to Clan
	@ManyToOne
	private Clan clan;

	//bi-directional many-to-one association to Kupovinaautomobil
	@ManyToOne
	private Kupovinaautomobil kupovinaautomobil;

	public Osiguranje() {
	}

	public int getIdServis() {
		return this.idServis;
	}

	public void setIdServis(int idServis) {
		this.idServis = idServis;
	}

	public Date getDatumKraja() {
		return this.datumKraja;
	}

	public void setDatumKraja(Date datumKraja) {
		this.datumKraja = datumKraja;
	}

	public Date getDatumPocetka() {
		return this.datumPocetka;
	}

	public void setDatumPocetka(Date datumPocetka) {
		this.datumPocetka = datumPocetka;
	}

	public int getPremija() {
		return this.premija;
	}

	public void setPremija(int premija) {
		this.premija = premija;
	}

	public String getVrstaOsiguranja() {
		return this.vrstaOsiguranja;
	}

	public void setVrstaOsiguranja(String vrstaOsiguranja) {
		this.vrstaOsiguranja = vrstaOsiguranja;
	}

	public Clan getClan() {
		return this.clan;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

	public Kupovinaautomobil getKupovinaautomobil() {
		return this.kupovinaautomobil;
	}

	public void setKupovinaautomobil(Kupovinaautomobil kupovinaautomobil) {
		this.kupovinaautomobil = kupovinaautomobil;
	}

}