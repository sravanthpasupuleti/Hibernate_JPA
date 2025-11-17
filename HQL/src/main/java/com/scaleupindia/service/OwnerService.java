package com.scaleupindia.service;

import java.util.List;

import com.scaleupindia.dto.OwnerDTO;
import com.scaleupindia.exception.OwnerNotFoundException;


public interface OwnerService {
	OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException;

	List<OwnerDTO> findAllOwners();
}