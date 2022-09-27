package com.samsung.sds.demo.respository.mybatis;

import java.util.List;

import com.samsung.sds.demo.respository.CampaignRepository;
import com.samsung.sds.demo.respository.entity.CampaignEntity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CampaignRepositoryDao extends CampaignRepository {
    @Select("select id, `name`, description, `From`, `to`, pictureUri, detailsUri from campaigns")
    public List<CampaignEntity> listCampaigns();
}