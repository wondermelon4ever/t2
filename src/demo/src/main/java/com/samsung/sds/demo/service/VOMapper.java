package com.samsung.sds.demo.service;

import com.samsung.sds.demo.respository.entity.CampaignEntity;
import com.samsung.sds.demo.service.vo.CampaignVO;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VOMapper {
    CampaignVO toCampaignVO(CampaignEntity entity);
}
