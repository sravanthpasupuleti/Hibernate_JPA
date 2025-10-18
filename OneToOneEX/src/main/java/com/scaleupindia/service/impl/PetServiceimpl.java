// package com.scaleupindia.service.impl;

// import com.scaleupindia.owner.Pet;
// import com.scaleupindia.dto.PetDTO;
// import com.scaleupindia.exception.OwnerNotFoundException;
// import com.scaleupindia.util.MapperUtil;
// import com.scaleupindia.repository.impl.PetRepositoryimpl;
// import com.scaleupindia.config.PropertiesConfig;

// public class PetServiceimpl{

// private static final String PET_NOT_FOUND = "owner.not.found";
// private static final PropertiesConfig PROPERTIES_CONFIG = PropertiesConfig.getInstance();

// private final PetRepositoryimpl petRepositoryimpl;

//     public PetDtO findpetid(int petid){
//         Pet pet = petRepositoryimpl.findpetid(petid);
// 		if (Objects.isNull(pet)) {        //returns true if object is null
// 			throw new OwnerNotFoundException(String.format(PROPERTIES_CONFIG.getProperty(PET_NOT_FOUND), petid));
// 		}
//         return MapperUtil.convertPetEntityToDto(pet);
//     }
// }