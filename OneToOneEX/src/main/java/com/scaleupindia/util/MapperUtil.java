package com.scaleupindia.util;


import com.scaleupindia.dto.OwnerDTO;
import com.scaleupindia.dto.PetDTO;
import com.scaleupindia.owner.Owner;
import com.scaleupindia.owner.Pet;

public class MapperUtil {
	private MapperUtil() {

	}

	public static OwnerDTO convertOwnerEntityToDto(Owner owner) {
		OwnerDTO ownerDTO = new OwnerDTO();
		ownerDTO.setId(owner.getId());
		ownerDTO.setFirstName(owner.getFirstName());
		ownerDTO.setLastName(owner.getLastName());
		ownerDTO.setGender(owner.getGender());
		ownerDTO.setCity(owner.getCity());
		ownerDTO.setState(owner.getState());
		ownerDTO.setMobileNumber(owner.getMobileNumber());
		ownerDTO.setEmailId(owner.getEmailId());
		PetDTO petDTO = convertPetEntityToDto(owner.getpet());
		ownerDTO.setpetDTO(petDTO);
		return ownerDTO;
	}

	public static PetDTO convertPetEntityToDto(Pet pet) {
		PetDTO petDTO = new PetDTO();
		petDTO.setPetId(pet.getPetId());
		petDTO.setPetName(pet.getPetName());
		petDTO.setPetBirthDate(pet.getPetBirthDate());
		petDTO.setPetGender(pet.getPetGender());
		petDTO.setPetType(pet.getPetType());
		return petDTO;
	}

	

	public static Owner convertOwnerDtoToEntity(OwnerDTO ownerDTO) {
		Owner owner = new Owner();
		owner.setFirstName(ownerDTO.getFirstName());
		owner.setLastName(ownerDTO.getLastName());
		owner.setGender(ownerDTO.getGender());
		owner.setCity(ownerDTO.getCity());
		owner.setState(ownerDTO.getState());
		owner.setMobileNumber(ownerDTO.getMobileNumber());
		owner.setEmailId(ownerDTO.getEmailId());
		Pet pet = convertPetDtoToEntity(ownerDTO.getpetDTO());
		owner.setpet(pet);
		return owner;
	}

	public static Pet convertPetDtoToEntity(PetDTO petDTO) {
		Pet pet = new Pet();
		pet.setPetName(petDTO.getPetName());
		pet.setPetBirthDate(petDTO.getPetBirthDate());
		pet.setPetGender(petDTO.getPetGender());
		pet.setPetType(petDTO.getPetType());
		return pet;
	}
}