package com.scaleupindia.service.impl;

import java.util.Objects;

import com.scaleupindia.config.PropertiesConfig;
import com.scaleupindia.dto.OwnerDTO;
import com.scaleupindia.exception.DuplicateOwnerException;
import com.scaleupindia.exception.OwnerNotFoundException;
import com.scaleupindia.owner.CompositePrimaryKey;
import com.scaleupindia.owner.Owner;
import com.scaleupindia.repository.OwnerRepository;
import com.scaleupindia.repository.impl.OwnerRepositoryImpl;
import com.scaleupindia.service.OwnerService;
import com.scaleupindia.util.MapperUtil;


public class OwnerServiceImpl implements OwnerService {
	private final OwnerRepository ownerRepository;
	private static final String OWNER_ALREADY_EXISTS = "owner.already.exists";
	private static final String OWNER_NOT_FOUND = "ownerpet combination.not.found";
	private static final PropertiesConfig PROPERTIES_CONFIG = PropertiesConfig.getInstance();

	public OwnerServiceImpl() {
		this.ownerRepository = new OwnerRepositoryImpl();
	}

	@Override
	public void saveOwner(OwnerDTO ownerDTO) throws DuplicateOwnerException {
		CompositePrimaryKey primaryKey = new CompositePrimaryKey();
		primaryKey.setId(ownerDTO.getId());
		primaryKey.setPetId(ownerDTO.getPetId());
		Owner existingOwner = ownerRepository.findOwner(primaryKey);
		if (Objects.nonNull(existingOwner)) {   //returns true if object is not null
			throw new DuplicateOwnerException(
					String.format(PROPERTIES_CONFIG.getProperty(OWNER_ALREADY_EXISTS), ownerDTO.getId()));
		}
		Owner owner = MapperUtil.convertOwnerDtoToEntity(ownerDTO);
		ownerRepository.saveOwner(owner);
	}

	@Override
	public OwnerDTO findOwner(CompositePrimaryKey primaryKey) throws OwnerNotFoundException {
		Owner owner = ownerRepository.findOwner(primaryKey);
		if (Objects.isNull(owner)) {        //returns true if object is null
			throw new OwnerNotFoundException(String.format(PROPERTIES_CONFIG.getProperty(OWNER_NOT_FOUND), primaryKey));
		}
		return MapperUtil.convertOwnerEntityToDto(owner);
	}

	@Override
	public void updatePetDetails(CompositePrimaryKey primaryKey, String petName) throws OwnerNotFoundException {
		Owner owner = ownerRepository.findOwner(primaryKey);
		if (Objects.isNull(owner)) {
			throw new OwnerNotFoundException(String.format(PROPERTIES_CONFIG.getProperty(OWNER_NOT_FOUND), primaryKey));
		}
		ownerRepository.updatePetDetails(primaryKey, petName);
	}

	@Override
	public void deleteOwner(CompositePrimaryKey primaryKey) throws OwnerNotFoundException {
		Owner owner = ownerRepository.findOwner(primaryKey);
		if (Objects.isNull(owner)) {
			throw new OwnerNotFoundException(String.format(PROPERTIES_CONFIG.getProperty(OWNER_NOT_FOUND), primaryKey));
		}
		ownerRepository.deleteOwner(primaryKey);
	}
}
