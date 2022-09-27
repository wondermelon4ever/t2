package com.samsung.sds.emarket.marketing.repository.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.samsung.sds.emarket.marketing.repository.CampaignRepository;
import com.samsung.sds.emarket.marketing.repository.entity.CampaignEntity;

@Mapper
public interface CampaignRepositoryDao extends CampaignRepository {
	@Select("select id, `name`, description, `From`, `to`, pictureUri, detailsUri from campaigns")
	public List<CampaignEntity> listCampaigns(); 

	@Select("select id, `name`, description, `From`, `to`, pictureUri, detailsUri from campaigns where id = #{id}")
	public CampaignEntity getCampaign(Integer id);
}
