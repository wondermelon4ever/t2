package com.samsung.sds.emarket.marketing.repository;

import java.util.List;

import com.samsung.sds.emarket.marketing.repository.entity.CampaignEntity;

public interface CampaignRepository {

	public List<CampaignEntity> listCampaigns();
	public CampaignEntity getCampaign(Integer id);
	public int createCampaign(CampaignEntity entity);
	public int updateCampaign(CampaignEntity entity);
	public int deleteCampaigns(int id);
}
