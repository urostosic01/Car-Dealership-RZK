package com.pmf.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the automobil database table.
 * 
 */
@Entity
@NamedQuery(name="Automobil.findAll", query="SELECT a FROM Automobil a")
public class Automobil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAutomobil;

	private int cena;

	private int godiste;

	private String gorivo;

	private String karoserija;

	private int kubikaza;

	private int snaga;

	//bi-directional many-to-one association to Model
	@ManyToOne
	private Model model;

	//bi-directional many-to-one association to KupovinaAutomobil
	@OneToMany(mappedBy="automobil")
	private List<KupovinaAutomobil> kupovinaautomobils;

	public Automobil() {
	}

	public int getIdAutomobil() {
		return this.idAutomobil;
	}

	public void setIdAutomobil(int idAutomobil) {
		this.idAutomobil = idAutomobil;
	}

	public int getCena() {
		return this.cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public int getGodiste() {
		return this.godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public String getGorivo() {
		return this.gorivo;
	}

	public void setGorivo(String gorivo) {
		this.gorivo = gorivo;
	}

	public String getKaroserija() {
		return this.karoserija;
	}

	public void setKaroserija(String karoserija) {
		this.karoserija = karoserija;
	}

	public int getKubikaza() {
		return this.kubikaza;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}

	public int getSnaga() {
		return this.snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public List<KupovinaAutomobil> getKupovinaautomobils() {
		return this.kupovinaautomobils;
	}

	public void setKupovinaautomobils(List<KupovinaAutomobil> kupovinaautomobils) {
		this.kupovinaautomobils = kupovinaautomobils;
	}

	public KupovinaAutomobil addKupovinaautomobil(KupovinaAutomobil kupovinaautomobil) {
		getKupovinaautomobils().add(kupovinaautomobil);
		kupovinaautomobil.setAutomobil(this);

		return kupovinaautomobil;
	}

	public KupovinaAutomobil removeKupovinaautomobil(KupovinaAutomobil kupovinaautomobil) {
		getKupovinaautomobils().remove(kupovinaautomobil);
		kupovinaautomobil.setAutomobil(null);

		return kupovinaautomobil;
	}

}