package org.foobarspam.course;

import org.foobarspam.person.Pers;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by mariano.palliser on 27/04/2017.
 */
@Entity
public class Course {

	@Id //primary key
	private String id;
	private String name;
	private String description;

	@ManyToOne
	private Pers pers;

	public Course() {
	}

	public Course(String id, String name, String description, String persId) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.pers = new Pers(persId, "", "");
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

	public Pers getPers() {
		return pers;
	}

	public void setPers(Pers pers) {
		this.pers = pers;
	}

}
