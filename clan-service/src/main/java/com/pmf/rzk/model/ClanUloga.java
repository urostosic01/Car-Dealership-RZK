package com.pmf.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the clanuloga database table.
 * 
 */
@Entity
@NamedQuery(name="ClanUloga.findAll", query="SELECT c FROM ClanUloga c")
public class ClanUloga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idClanUloga;

	//bi-directional many-to-one association to Clan
	@ManyToOne
	private Clan clan;

	//bi-directional many-to-one association to Uloga
	@ManyToOne
	private Uloga uloga;

	public ClanUloga() {
	}

	public int getIdClanUloga() {
		return this.idClanUloga;
	}

	public void setIdClanUloga(int idClanUloga) {
		this.idClanUloga = idClanUloga;
	}

	public Clan getClan() {
		return this.clan;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

	public Uloga getUloga() {
		return this.uloga;
	}

	public void setUloga(Uloga uloga) {
		this.uloga = uloga;
	}

}