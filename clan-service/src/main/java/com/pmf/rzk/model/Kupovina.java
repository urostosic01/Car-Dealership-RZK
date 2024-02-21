package com.pmf.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the kupovina database table.
 * 
 */
@Entity
@NamedQuery(name="Kupovina.findAll", query="SELECT k FROM Kupovina k")
public class Kupovina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idKupovina;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datumKupovine;

	private String napomena;

	//bi-directional many-to-one association to Clan
	@ManyToOne
	private Clan clan;

	//bi-directional many-to-one association to KupovinaAutomobil
	@OneToMany(mappedBy="kupovina")
	private List<KupovinaAutomobil> kupovinaautomobils;

	public Kupovina() {
	}

	public int getIdKupovina() {
		return this.idKupovina;
	}

	public void setIdKupovina(int idKupovina) {
		this.idKupovina = idKupovina;
	}

	public Date getDatumKupovine() {
		return this.datumKupovine;
	}

	public void setDatumKupovine(Date datumKupovine) {
		this.datumKupovine = datumKupovine;
	}

	public String getNapomena() {
		return this.napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public Clan getClan() {
		return this.clan;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

	public List<KupovinaAutomobil> getKupovinaautomobils() {
		return this.kupovinaautomobils;
	}

	public void setKupovinaautomobils(List<KupovinaAutomobil> kupovinaautomobils) {
		this.kupovinaautomobils = kupovinaautomobils;
	}

	public KupovinaAutomobil addKupovinaautomobil(KupovinaAutomobil kupovinaautomobil) {
		getKupovinaautomobils().add(kupovinaautomobil);
		kupovinaautomobil.setKupovina(this);

		return kupovinaautomobil;
	}

	public KupovinaAutomobil removeKupovinaautomobil(KupovinaAutomobil kupovinaautomobil) {
		getKupovinaautomobils().remove(kupovinaautomobil);
		kupovinaautomobil.setKupovina(null);

		return kupovinaautomobil;
	}

}