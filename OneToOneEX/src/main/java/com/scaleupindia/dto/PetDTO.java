package com.scaleupindia.dto;

import java.time.LocalDate;

import com.scaleupindia.enums.Gender;
import com.scaleupindia.enums.PetType;

public class PetDTO {

    private int petId;
	private String petName;
	private LocalDate petBirthDate;
	private Gender petGender;
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

    @Override
    public String toString() {
        return "PetDTO [petId=" + petId + ", petName=" + petName + ", petBirthDate=" + petBirthDate + ", petGender="
                + petGender + ", petType=" + petType + "]";
    }

}
