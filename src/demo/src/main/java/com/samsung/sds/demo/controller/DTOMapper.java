package com.samsung.sds.demo.controller;

import com.samsung.sds.demo.api.model.CampaignDTO;
import com.samsung.sds.demo.service.vo.CampaignVO;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DTOMapper {
    CampaignDTO toCampaignDTO(CampaignVO campaign);

    // default JsonNullable<String> fromString(String name) {
    //     return JsonNullable.of(name);
    // }
}
