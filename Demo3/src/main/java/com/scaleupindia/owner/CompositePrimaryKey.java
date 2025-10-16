package com.scaleupindia.owner;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class CompositePrimaryKey implements Serializable{

    private static final long serialVersionUID = 1L;

	private int id;
	@Column(name = "pet_id")
	private int petId;

    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

}
