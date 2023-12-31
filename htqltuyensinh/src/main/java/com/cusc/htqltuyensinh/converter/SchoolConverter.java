package com.cusc.htqltuyensinh.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cusc.htqltuyensinh.dto.SchoolDTO;
import com.cusc.htqltuyensinh.entity.ProvinceEntity;
import com.cusc.htqltuyensinh.entity.SchoolEntity;
import com.cusc.htqltuyensinh.repository.ProvinceRepository;

@Component
public class SchoolConverter {
	
	@Autowired
	private ProvinceRepository provinceRepository;
	
	public SchoolEntity toEntity(SchoolDTO dto) {
		SchoolEntity entity = new SchoolEntity();
		ProvinceEntity provinceEntity = provinceRepository.findOneByCode(dto.getProvince());
		
		entity.setCode(dto.getCode());
		entity.setName(dto.getName());
		entity.setProvince(provinceEntity);
		
		return entity;
	}
	
	public SchoolDTO toDTO(SchoolEntity entity) {
		SchoolDTO dto = new SchoolDTO();
		ProvinceEntity provinceEntity = provinceRepository.findOneByCode(entity.getProvince().getCode());
		if(entity.getId() != null) dto.setId(entity.getId());
		dto.setCode(entity.getCode());
		dto.setName(entity.getName());
		dto.setProvince(provinceEntity.getCode());
		
		return dto;
	}
	
	public SchoolEntity toEntity(SchoolDTO dto, SchoolEntity entity) {
		ProvinceEntity provinceEntity = provinceRepository.findOneByCode(dto.getProvince());
		
		entity.setCode(dto.getCode());
		entity.setName(dto.getName());
		entity.setProvince(provinceEntity);
		
		return entity;
	}
}
