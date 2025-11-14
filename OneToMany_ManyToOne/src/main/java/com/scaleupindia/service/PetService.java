package com.scaleupindia.service;

import com.scaleupindia.dto.PetDTO;
import com.scaleupindia.exception.PetNotFoundException;


public interface PetService {
	PetDTO findPet(int petId) throws PetNotFoundException;
	
	PetDTO findPetWithOwner(int petId) throws PetNotFoundException;
}