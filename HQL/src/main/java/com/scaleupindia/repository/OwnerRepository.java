package com.scaleupindia.repository;

import java.util.List;

import com.scaleupindia.entity.Owner;


public interface OwnerRepository {
	Owner findOwner(int ownerId);

	List<Owner> findAllOwners();
}
