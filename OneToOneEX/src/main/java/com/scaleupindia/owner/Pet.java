package com.scaleupindia.owner;

import java.time.LocalDate;

import com.scaleupindia.enums.Gender;
import com.scaleupindia.enums.PetType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Pet_table")
public class Pet {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int petId;
	
	@Column(name = "pet_name", nullable = false)
	private String petName;
	@Column(name = "pet_date_of_birth", nullable = false)
	private LocalDate petBirthDate;
	@Enumerated(value = EnumType.STRING)
	@Column(name = "pet_gender", nullable = false)
	private Gender petGender;
	@Enumerated(value = EnumType.STRING)
	@Column(name = "pet_type", nullable = false)
	private PetType petType;

    public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public LocalDate getPetBirthDate() {
		return petBirthDate;
	}

	public void setPetBirthDate(LocalDate petBirthDate) {
		this.petBirthDate = petBirthDate;
	}

	public Gender getPetGender() {
		return petGender;
	}

	public void setPetGender(Gender petGender) {
		this.petGender = petGender;
	}

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}
}
