package com.pmf.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


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

	//bi-directional many-to-one association to Clanuloga
	@OneToMany(mappedBy="uloga")
	@JsonIgnore
	private List<Clanuloga> clanulogas;

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

	public List<Clanuloga> getClanulogas() {
		return this.clanulogas;
	}

	public void setClanulogas(List<Clanuloga> clanulogas) {
		this.clanulogas = clanulogas;
	}

	public Clanuloga addClanuloga(Clanuloga clanuloga) {
		getClanulogas().add(clanuloga);
		clanuloga.setUloga(this);

		return clanuloga;
	}

	public Clanuloga removeClanuloga(Clanuloga clanuloga) {
		getClanulogas().remove(clanuloga);
		clanuloga.setUloga(null);

		return clanuloga;
	}

}