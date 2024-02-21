package com.pmf.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the clan database table.
 * 
 */
@Entity
@NamedQuery(name="Clan.findAll", query="SELECT c FROM Clan c")
public class Clan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idClan;

	private String adresa;

	private String brojTelefona;

	private String ime;

	private String korisnickoIme;

	private String prezime;

	private String sifra;

	//bi-directional many-to-one association to Bankovniracun
	@OneToMany(mappedBy="clan")
	@JsonIgnore
	private List<Bankovniracun> bankovniracuns;

	//bi-directional many-to-one association to Clanuloga
	@OneToMany(mappedBy="clan")
	@JsonIgnore
	private List<Clanuloga> clanulogas;

	//bi-directional many-to-one association to Kupovina
	@OneToMany(mappedBy="clan")
	@JsonIgnore
	private List<Kupovina> kupovinas;

	//bi-directional many-to-one association to Osiguranje
	@OneToMany(mappedBy="clan")
	@JsonIgnore
	private List<Osiguranje> osiguranjes;

	public Clan() {
	}

	public int getIdClan() {
		return this.idClan;
	}

	public void setIdClan(int idClan) {
		this.idClan = idClan;
	}

	public String getAdresa() {
		return this.adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getBrojTelefona() {
		return this.brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getKorisnickoIme() {
		return this.korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getPrezime() {
		return this.prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getSifra() {
		return this.sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public List<Bankovniracun> getBankovniracuns() {
		return this.bankovniracuns;
	}

	public void setBankovniracuns(List<Bankovniracun> bankovniracuns) {
		this.bankovniracuns = bankovniracuns;
	}

	public Bankovniracun addBankovniracun(Bankovniracun bankovniracun) {
		getBankovniracuns().add(bankovniracun);
		bankovniracun.setClan(this);

		return bankovniracun;
	}

	public Bankovniracun removeBankovniracun(Bankovniracun bankovniracun) {
		getBankovniracuns().remove(bankovniracun);
		bankovniracun.setClan(null);

		return bankovniracun;
	}

	public List<Clanuloga> getClanulogas() {
		return this.clanulogas;
	}

	public void setClanulogas(List<Clanuloga> clanulogas) {
		this.clanulogas = clanulogas;
	}

	public Clanuloga addClanuloga(Clanuloga clanuloga) {
		getClanulogas().add(clanuloga);
		clanuloga.setClan(this);

		return clanuloga;
	}

	public Clanuloga removeClanuloga(Clanuloga clanuloga) {
		getClanulogas().remove(clanuloga);
		clanuloga.setClan(null);

		return clanuloga;
	}

	public List<Kupovina> getKupovinas() {
		return this.kupovinas;
	}

	public void setKupovinas(List<Kupovina> kupovinas) {
		this.kupovinas = kupovinas;
	}

	public Kupovina addKupovina(Kupovina kupovina) {
		getKupovinas().add(kupovina);
		kupovina.setClan(this);

		return kupovina;
	}

	public Kupovina removeKupovina(Kupovina kupovina) {
		getKupovinas().remove(kupovina);
		kupovina.setClan(null);

		return kupovina;
	}

	public List<Osiguranje> getOsiguranjes() {
		return this.osiguranjes;
	}

	public void setOsiguranjes(List<Osiguranje> osiguranjes) {
		this.osiguranjes = osiguranjes;
	}

	public Osiguranje addOsiguranje(Osiguranje osiguranje) {
		getOsiguranjes().add(osiguranje);
		osiguranje.setClan(this);

		return osiguranje;
	}

	public Osiguranje removeOsiguranje(Osiguranje osiguranje) {
		getOsiguranjes().remove(osiguranje);
		osiguranje.setClan(null);

		return osiguranje;
	}

}