package com.samsung.sds.emarket.marketing.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.TestPropertySource;

import com.samsung.sds.emarket.marketing.repository.entity.CampaignEntity;

@MybatisTest
@TestPropertySource(properties = { "spring.config.location=classpath:application-test.properties" })
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CampaignRepositoryTests {
	@Autowired
	private CampaignRepository campaignRepository;

	@Test
	public void test_listCampaigns() {
		List<CampaignEntity> list = campaignRepository.listCampaigns();
		assertThat(list).extracting("id", "name", "description").contains(                
				tuple(1, "campaign 1", "campaign description 1"),
				tuple(2, "campaign 2", "campaign description 2")
				);
	}

}
