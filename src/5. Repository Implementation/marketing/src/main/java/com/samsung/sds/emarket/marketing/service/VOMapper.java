package com.samsung.sds.emarket.marketing.service;

import org.mapstruct.Mapper;

import com.samsung.sds.emarket.marketing.repository.entity.CampaignEntity;
import com.samsung.sds.emarket.marketing.service.vo.CampaignVO;

@Mapper(componentModel = "spring")
public interface VOMapper {
	CampaignVO toCampaignVO(CampaignEntity entity);
}