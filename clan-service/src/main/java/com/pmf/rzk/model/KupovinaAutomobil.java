package com.pmf.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the kupovinaautomobil database table.
 * 
 */
@Entity
@NamedQuery(name="KupovinaAutomobil.findAll", query="SELECT k FROM KupovinaAutomobil k")
public class KupovinaAutomobil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idKupovinaAutomobil;

	private int kolicina;

	//bi-directional many-to-one association to Automobil
	@ManyToOne
	private Automobil automobil;

	//bi-directional many-to-one association to Kupovina
	@ManyToOne
	@JoinColumn(name="Kupovina_idKupovina1")
	private Kupovina kupovina;

	//bi-directional many-to-one association to Osiguranje
	@OneToMany(mappedBy="kupovinaautomobil")
	private List<Osiguranje> osiguranjes;

	public KupovinaAutomobil() {
	}

	public int getIdKupovinaAutomobil() {
		return this.idKupovinaAutomobil;
	}

	public void setIdKupovinaAutomobil(int idKupovinaAutomobil) {
		this.idKupovinaAutomobil = idKupovinaAutomobil;
	}

	public int getKolicina() {
		return this.kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public Automobil getAutomobil() {
		return this.automobil;
	}

	public void setAutomobil(Automobil automobil) {
		this.automobil = automobil;
	}

	public Kupovina getKupovina() {
		return this.kupovina;
	}

	public void setKupovina(Kupovina kupovina) {
		this.kupovina = kupovina;
	}

	public List<Osiguranje> getOsiguranjes() {
		return this.osiguranjes;
	}

	public void setOsiguranjes(List<Osiguranje> osiguranjes) {
		this.osiguranjes = osiguranjes;
	}

	public Osiguranje addOsiguranje(Osiguranje osiguranje) {
		getOsiguranjes().add(osiguranje);
		osiguranje.setKupovinaautomobil(this);

		return osiguranje;
	}

	public Osiguranje removeOsiguranje(Osiguranje osiguranje) {
		getOsiguranjes().remove(osiguranje);
		osiguranje.setKupovinaautomobil(null);

		return osiguranje;
	}

}