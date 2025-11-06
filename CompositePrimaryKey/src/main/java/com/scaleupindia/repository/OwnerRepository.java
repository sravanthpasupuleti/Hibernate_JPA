package com.scaleupindia.repository;

import com.scaleupindia.owner.CompositePrimaryKey;
import com.scaleupindia.owner.Owner;


public interface OwnerRepository {
	void saveOwner(Owner owner);

	Owner findOwner(CompositePrimaryKey primaryKey);

	void updatePetDetails(CompositePrimaryKey primaryKey, String petName);

	void deleteOwner(CompositePrimaryKey primaryKey);

}
