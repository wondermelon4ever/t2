package com.samsung.sds.emarket.marketing.controller; 

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.web.servlet.MockMvc;

import com.samsung.sds.emarket.marketing.service.CampaignService;
import com.samsung.sds.emarket.marketing.service.vo.CampaignVO;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(CampaignController.class)
@ComponentScan(
		basePackageClasses = {
				DTOMapper.class
		})
public class CampaignControllerTests {        
	@Autowired
	private MockMvc mvc;

	@MockBean
	private CampaignService campaignService;    

	@Test
	public void test_getCampaignList() throws Exception {
		List<CampaignVO> result = new ArrayList<CampaignVO>();
		CampaignVO campaignVo = new CampaignVO();
		campaignVo.setId(1);
		campaignVo.setName("test campaign 1");
		result.add(campaignVo);

		campaignVo = new CampaignVO();
		campaignVo.setId(2);
		campaignVo.setName("test campaign 2");
		result.add(campaignVo);

		when(campaignService.listCampaigns()).thenReturn(result);

		this.mvc.perform(get("/api/v1/campaigns"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.[0].id", is(1)))
		.andExpect(jsonPath("$.[0].name", is("test campaign 1")))
		.andExpect(jsonPath("$.[1].id", is(2)))
		.andExpect(jsonPath("$.[1].name", is("test campaign 2")))
		;
	}
}