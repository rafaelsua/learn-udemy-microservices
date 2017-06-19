/**
 * 
 */
package com.dhaker.microservices.lab1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author rsuarez
 *
 */
@Entity
public class Player {
	
	
	
	
	/**
	 * 
	 */
	public Player() {
		super();
	}
	/**
	 * @param name
	 * @param position
	 */
	public Player(String name, String position) {
		this();
		this.name = name;
		this.position = position;
	}
	@Id
	@GeneratedValue
	Long id;
	String name;
	String position;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
