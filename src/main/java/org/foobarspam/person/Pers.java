package org.foobarspam.person;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mariano.palliser on 25/04/2017.
 */
@Entity //crea una tabla con los atributos del objeto como columnas
public class Pers {

	@Id //primary key
	private String id;
	private String name;
	private String description;

	public Pers() {
	}

	public Pers(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
