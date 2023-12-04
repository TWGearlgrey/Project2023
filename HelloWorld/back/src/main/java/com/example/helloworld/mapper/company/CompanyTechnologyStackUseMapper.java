package com.example.helloworld.mapper.company;


import com.example.helloworld.dto.company.CompanyUsedTechStackDTO;
import com.example.helloworld.entity.company.CompanyUsedTechStackEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyTechnologyStackUseMapper {
    public CompanyUsedTechStackDTO toDTO(CompanyUsedTechStackEntity entity);
    public CompanyUsedTechStackEntity toEntity(CompanyUsedTechStackDTO dto);
}
