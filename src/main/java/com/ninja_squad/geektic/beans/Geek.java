package com.ninja_squad.geektic.beans;

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
	@Column(name = "idGeek")
	private String idGeek;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "age")
	private String age;
	@Column(name = "mail")
	private String mail;
	@Column(name = "sexe")
	private String sexe;
	@Column(name = "languagePref")
	private String language;
	@Column(name = "compagnonVoyage")
	private String compagnon;
	@Column(name = "repas")
	private String repas;
	@Column(name = "sport")
	private String sport;
	
	
	public String getId() {
		return idGeek;
	}
	
	
	public String getNom() {
		return nom;
	}

	
	public String getPrenom() {
		return prenom;
	}

	
	public String getAge() {
		return age;
	}

	
	public String getMail() {
		return mail;
	}

	
	public String getSexe() {
		return sexe;
	}

	
	public String getLanguage() {
		return language;
	}

	
	public String getCompagnon() {
		return compagnon;
	}

	
	public String getRepas() {
		return repas;
	}

	
	public String getSport() {
		return sport;
	}

	
	
	
	
	
	
}
