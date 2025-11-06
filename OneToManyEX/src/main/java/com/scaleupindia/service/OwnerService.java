package com.scaleupindia.service;

import com.scaleupindia.dto.OwnerDTO;
import com.scaleupindia.exception.OwnerNotFoundException;


public interface OwnerService {
	void saveOwner(OwnerDTO ownerDTO);

	OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException;

	OwnerDTO findOwnerWithPet(int ownerId) throws OwnerNotFoundException;

	void updatePetDetails(int ownerId, int petId, String petName) throws OwnerNotFoundException;

	void deleteOwner(int ownerId) throws OwnerNotFoundException;
}