package com.samsung.sds.emarket.marketing.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.samsung.sds.emarket.marketing.api.CampaignsApi;
import com.samsung.sds.emarket.marketing.api.model.CampaignDTO;

import io.swagger.annotations.Api;

@Controller
@Api(tags = "Campaigns")
public class CampaignController implements CampaignsApi {

	@Override
	public ResponseEntity<List<CampaignDTO>> getCampaignList() {
		List<CampaignDTO> result = new ArrayList<CampaignDTO>();

		CampaignDTO campaignDto = new CampaignDTO();
		campaignDto.setId(1);
		campaignDto.setName("test campaign 1");
		result.add(campaignDto);

		campaignDto = new CampaignDTO();
		campaignDto.setId(2);
		campaignDto.setName("test campaign 2");
		result.add(campaignDto);

		return ResponseEntity.ok().body(result);
	}

	@Override
	public ResponseEntity<CampaignDTO> getCampaign(Integer id) {

		CampaignDTO campaignDto = new CampaignDTO();
		campaignDto.setId(id);
		campaignDto.setName("test campaign " + id);

		return ResponseEntity.ok().body(campaignDto);

	}

}