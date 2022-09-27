package com.samsung.sds.emarket.marketing.service;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.samsung.sds.emarket.marketing.repository.CampaignRepository;
import com.samsung.sds.emarket.marketing.repository.entity.CampaignEntity;
import com.samsung.sds.emarket.marketing.service.vo.CampaignVO;

@ExtendWith(MockitoExtension.class)
public class CampaignServiceTests {

	@Mock
	private CampaignRepository campaignRepository;

	@Test
	public void test_listCampaigns() {

		List<CampaignEntity> result = new ArrayList<>();
		CampaignEntity campaign = new CampaignEntity();
		campaign.setId(3);
		campaign.setName("test name 3");
		result.add(campaign);

		campaign = new CampaignEntity();
		campaign.setId(4);
		campaign.setName("test name 4");
		result.add(campaign);

		when(campaignRepository.listCampaigns()).thenReturn(result);    

		CampaignService campaignService = new CampaignServiceImpl(campaignRepository, new VOMapperImpl());

		List<CampaignVO> list = campaignService.listCampaigns();
		assertThat(list).extracting("id", "name").contains(
				tuple(3, "test name 3"),
				tuple(4, "test name 4")
				);
	}
}