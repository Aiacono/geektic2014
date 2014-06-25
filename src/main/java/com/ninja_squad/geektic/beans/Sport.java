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
@Table(name="sportPrefere")
public class Sport {
	
	@Id
	@Column(name = "idSport")
	private String idGeek;
	@Column(name = "sport")
	private String sport;

}
