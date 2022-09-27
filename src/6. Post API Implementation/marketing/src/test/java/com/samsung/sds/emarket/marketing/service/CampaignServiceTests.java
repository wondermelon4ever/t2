package com.samsung.sds.emarket.marketing.service;


import com.samsung.sds.emarket.marketing.repository.CampaignRepository;
import com.samsung.sds.emarket.marketing.repository.entity.CampaignEntity;
import com.samsung.sds.emarket.marketing.service.vo.CampaignVO;
import com.samsung.sds.emarket.marketing.service.vo.NewCampaignVO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

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

	@Test
	public void test_createCampaign() {
		String name = "test name";
		OffsetDateTime from = OffsetDateTime.now();
		OffsetDateTime to = from.plusMonths(3); 

		NewCampaignVO newCampaign = new NewCampaignVO();
		newCampaign.setName(name);
		newCampaign.setDescription("desc");
		newCampaign.setDetailsUri("detailUri");
		newCampaign.setFrom(from);
		newCampaign.setFrom(to);


		when(campaignRepository.createCampaign(any(CampaignEntity.class)))
		.thenAnswer(
				(InvocationOnMock invocation) -> {
					((CampaignEntity)invocation.getArguments()[0]).setId(100);
					return 1;
				});

		CampaignService campaignService = new CampaignServiceImpl(campaignRepository, new VOMapperImpl());
		assertThat(campaignService.createCampaign(newCampaign))
		.hasFieldOrPropertyWithValue("id", 100)
		.hasFieldOrPropertyWithValue("name", name)
		;
	}
}
