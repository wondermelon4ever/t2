package com.samsung.sds.emarket.marketing.controller;

import org.mapstruct.Mapper;

import com.samsung.sds.emarket.marketing.api.model.CampaignDTO;
import com.samsung.sds.emarket.marketing.service.vo.CampaignVO; 


@Mapper(componentModel = "spring")
public interface DTOMapper {

	CampaignDTO toCampaignDTO(CampaignVO campaign);

}