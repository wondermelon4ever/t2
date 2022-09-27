package com.samsung.sds.emarket.marketing.controller; 

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
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
import com.samsung.sds.emarket.marketing.service.vo.NewCampaignVO;

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

	@Test
	public void test_postCampaign() throws Exception {
		String name = "test campaign 1";

		JSONObject json = new JSONObject();
		json.put("name", name);
		json.put("description", "campaign description 1");
		json.put("From", "2021-05-27T05:01:43+09:00");
		json.put("to", "2021-06-03T05:01:43+09:00");
		json.put("pictureUri", "/images/banner1.png");
		json.put("detailsUri", "/images/detail1.png");    


		CampaignVO campaignVO = new CampaignVO();
		campaignVO.setId(100);
		campaignVO.setName(name);

		when(campaignService.createCampaign(any(NewCampaignVO.class))).thenReturn(
				campaignVO
				);


		this.mvc.perform(post("/api/v1/campaigns").contentType("application/json").content(json.toString()))
		.andExpect(status().isCreated())
		.andExpect(jsonPath("$.id", is(100)))
		.andExpect(jsonPath("$.name", is(name)))
		;
	}

	@Test
	public void test_postCampaign_only_required() throws Exception {
		String name = "test campaign 1";

		JSONObject json = new JSONObject();
		json.put("name", name);
		json.put("description", "campaign description 1");

		CampaignVO campaignVO = new CampaignVO();
		campaignVO.setId(100);
		campaignVO.setName(name);

		when(campaignService.createCampaign(any(NewCampaignVO.class))).thenReturn(
				campaignVO
				);

		this.mvc.perform(post("/api/v1/campaigns").contentType("application/json").content(json.toString()))
		.andExpect(status().isCreated())
		.andExpect(jsonPath("$.id", is(100)))
		.andExpect(jsonPath("$.name", is(name)))
		;

	}

	@Test
	public void test_postCampaign_without_required() throws Exception {
		// without name field
		JSONObject json = new JSONObject();
		// json.put("name", "campaign 1");
		json.put("description", "campaign description 1");

		this.mvc.perform(post("/api/v1/campaigns").contentType("application/json").content(json.toString()))
		.andExpect(status().is(400));

		// without description field
		json = new JSONObject();
		json.put("name", "campaign 1");
		// json.put("description", "campaign description 1");

		this.mvc.perform(post("/api/v1/campaigns").contentType("application/json").content(json.toString()))
		.andExpect(status().is(400));
	}

}