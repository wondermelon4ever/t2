package com.samsung.sds.emarket.marketing.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.samsung.sds.emarket.marketing.service.vo.CampaignVO;

@Service
public class CampaignServiceImpl implements CampaignService {

	@Override
	public List<CampaignVO> listCampaigns() {
		List<CampaignVO> result = new ArrayList<>();

		CampaignVO campaign = new CampaignVO();
		campaign.setId(3);
		campaign.setName("test name 3");
		result.add(campaign);

		campaign = new CampaignVO();
		campaign.setId(4);
		campaign.setName("test name 4");
		result.add(campaign);

		return result;
	}

	@Override
	public CampaignVO getCampaign(Integer id) {
		CampaignVO campaign = new CampaignVO();
		campaign.setId(id);
		campaign.setName("test campaign " + id);

		return campaign;
	}
}
