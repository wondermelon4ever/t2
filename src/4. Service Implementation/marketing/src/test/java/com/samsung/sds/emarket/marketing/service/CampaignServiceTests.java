package com.samsung.sds.emarket.marketing.service;


import com.samsung.sds.emarket.marketing.service.vo.CampaignVO;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

public class CampaignServiceTests {

	@Test
	public void test_listCampaigns() {
		CampaignService campaignService = new CampaignServiceImpl();

		List<CampaignVO> list = campaignService.listCampaigns();
		assertThat(list).extracting("id", "name").contains(
				tuple(3, "test name 3"),
				tuple(4, "test name 4")
				);
	}
}