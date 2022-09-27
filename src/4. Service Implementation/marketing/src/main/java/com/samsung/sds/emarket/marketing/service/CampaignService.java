package com.samsung.sds.emarket.marketing.service;

import java.util.List;

import com.samsung.sds.emarket.marketing.service.vo.CampaignVO;

public interface CampaignService {
	List<CampaignVO> listCampaigns();
	CampaignVO getCampaign(Integer id);
}
