package com.ninja_squad.geetik.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GEEKTIC")
public class Geek {

	@Id
	private String idGeek;
	private String nom;
	private String prenom;
	private String age;
	private String mail;
	private String sexe;
	private String language;
	private String compagnon;
	private String repas;
	private String sport;
	
	
	public String getId() {
		return idGeek;
	}
	
	@Column(name = "nom")
	public String getNom() {
		return nom;
	}

	@Column(name = "prenom")
	public String getPrenom() {
		return prenom;
	}

	@Column(name = "age")
	public String getAge() {
		return age;
	}

	@Column(name = "mail")
	public String getMail() {
		return mail;
	}

	@Column(name = "sexe")
	public String getSexe() {
		return sexe;
	}

	@Column(name = "languagePref")
	public String getLanguage() {
		return language;
	}

	@Column(name = "compagnonVoyage")
	public String getCompagnon() {
		return compagnon;
	}

	@Column(name = "repas")
	public String getRepas() {
		return repas;
	}

	@Column(name = "sport")
	public String getSport() {
		return sport;
	}

	
	
	
	
	
	
}
