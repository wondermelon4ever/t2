package com.samsung.sds.emarket.marketing.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(CampaignController.class)
public class CampaignControllerTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void test_getCampaignList() throws Exception {
		this.mvc.perform(get("/api/v1/campaigns"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.[0].id", is(1)))
		.andExpect(jsonPath("$.[0].name", is("test campaign 1")))
		.andExpect(jsonPath("$.[1].id", is(2)))
		.andExpect(jsonPath("$.[1].name", is("test campaign 2")))
		;
	}
}
