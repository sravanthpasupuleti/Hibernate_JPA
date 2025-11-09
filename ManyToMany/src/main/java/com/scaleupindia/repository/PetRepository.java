package com.scaleupindia.repository;

import com.scaleupindia.entity.Pet;


public interface PetRepository {
	Pet findPet(int petId);
	
	Pet findPetWithOwner(int petId);
}
