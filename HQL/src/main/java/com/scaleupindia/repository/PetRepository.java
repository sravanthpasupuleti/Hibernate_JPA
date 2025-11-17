package com.scaleupindia.repository;

import java.util.List;

import com.scaleupindia.entity.Pet;


public interface PetRepository {
	Pet findPet(int petId);

	List<Pet> findAllPets();
}
