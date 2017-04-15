package com.moelleranja.dsa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * @author Anja Möller
 */

@Entity
@Table(name = "character")
public class DSACharacter {
	
	@Id
	@NotNull
	@Column(name = "id")
	private String id;
	
	@NotNull
	@Column(name = "name")
	private String name;
	
	@NotNull
	@Column(name = "maxlp")
	private int maxLp;
	
	@NotNull
	@Column(name = "lp")
	private int lp;
	
	@NotNull
	@Column(name = "maxasp")
	private int maxAsp;
	
	@NotNull
	@Column(name = "asp")
	private int asp;
	
	@NotNull
	@Column(name = "ini")
	private int ini;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "quotes")
	private String quotes;
	
	@Column(name = "img")
	private String img;
	
	@Column(name = "visible")
	private boolean visible;
	
	@Column(name = "combatactive")
	private boolean combatactive;

	public DSACharacter() {this.id = UUID.randomUUID().toString();}
}
