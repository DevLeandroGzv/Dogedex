package com.leamdro.dogedex.api.dto

import com.leamdro.dogedex.Dog

class DogsDTOMapper {

    private fun fromDogDTOToDOgDomain(dogDTO:DogDTO): Dog {
        return Dog(dogDTO.id,dogDTO.index,dogDTO.name,dogDTO.type,dogDTO.heightFemale,dogDTO.heightMale,dogDTO.imageUrl,dogDTO.lifeExpectancy,dogDTO.temperament,dogDTO.WeightFemale,dogDTO.WeightMale)
    }

    fun formDogDTOListToDomainList(dogDTOList:List<DogDTO>):List<Dog>{
        return dogDTOList.map { fromDogDTOToDOgDomain(it) }
    }
}