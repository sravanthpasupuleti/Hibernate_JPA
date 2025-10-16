package com.scaleupindia.service;


import com.scaleupindia.dto.OwnerDTO;
import com.scaleupindia.exception.DuplicateOwnerException;
import com.scaleupindia.exception.OwnerNotFoundException;
import com.scaleupindia.owner.CompositePrimaryKey;


public interface OwnerService {
	void saveOwner(OwnerDTO ownerDTO) throws DuplicateOwnerException;

	OwnerDTO findOwner(CompositePrimaryKey primaryKey) throws OwnerNotFoundException;

	void updatePetDetails(CompositePrimaryKey primaryKey, String petName) throws OwnerNotFoundException;

	void deleteOwner(CompositePrimaryKey primaryKey) throws OwnerNotFoundException;

}