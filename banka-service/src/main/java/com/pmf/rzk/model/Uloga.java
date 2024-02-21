package com.pmf.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the uloga database table.
 * 
 */
@Entity
@NamedQuery(name="Uloga.findAll", query="SELECT u FROM Uloga u")
public class Uloga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUloga;

	private String naziv;

	//bi-directional many-to-one association to ClanUloga
	@OneToMany(mappedBy="uloga")
	private List<ClanUloga> clanulogas;

	public Uloga() {
	}

	public int getIdUloga() {
		return this.idUloga;
	}

	public void setIdUloga(int idUloga) {
		this.idUloga = idUloga;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<ClanUloga> getClanulogas() {
		return this.clanulogas;
	}

	public void setClanulogas(List<ClanUloga> clanulogas) {
		this.clanulogas = clanulogas;
	}

	public ClanUloga addClanuloga(ClanUloga clanuloga) {
		getClanulogas().add(clanuloga);
		clanuloga.setUloga(this);

		return clanuloga;
	}

	public ClanUloga removeClanuloga(ClanUloga clanuloga) {
		getClanulogas().remove(clanuloga);
		clanuloga.setUloga(null);

		return clanuloga;
	}

}