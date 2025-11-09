package com.scaleupindia.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.scaleupindia.enums.Gender;
import com.scaleupindia.enums.PetType;

public class PetDTO {
	private int id;
	private String name;
	private LocalDate birthDate;
	private Gender gender;
	private PetType type;

	private List<OwnerDTO> ownerDTOList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public PetType getType() {
		return type;
	}

	public void setType(PetType type) {
		this.type = type;
	}

	public List<OwnerDTO> getOwnerDTOList() {
		return ownerDTOList;
	}

	public void setOwnerDTOList(List<OwnerDTO> ownerDTO) {
		this.ownerDTOList = ownerDTO;
	}

	@Override
	public String toString() {
		if (Objects.isNull(ownerDTOList)) {
			return "PetDTO [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", gender=" + gender + ", type="
					+ type + "]";
		} else {
			return "PetDTO [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", gender=" + gender + ", type="
					+ type + ", ownerDTO=" + ownerDTOList + "]";
		}
	}
}
