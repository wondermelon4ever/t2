package com.samsung.sds.emarket.marketing.service;

import com.samsung.sds.emarket.marketing.repository.CampaignRepository;
import com.samsung.sds.emarket.marketing.repository.entity.CampaignEntity;
import com.samsung.sds.emarket.marketing.service.vo.CampaignVO;
import com.samsung.sds.emarket.marketing.service.vo.NewCampaignVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class CampaignServiceImpl implements CampaignService {

	private final CampaignRepository campaignRepository;
	private final VOMapper voMapper;

	public CampaignServiceImpl(CampaignRepository campaignRepository, VOMapper voMapper) {
		this.campaignRepository = campaignRepository;
		this.voMapper = voMapper;
	}

	@Override
	public List<CampaignVO> listCampaigns() {
		List<CampaignVO> result = new ArrayList<>();

		for (CampaignEntity campaignEntity : campaignRepository.listCampaigns()) {

			result.add(voMapper.toCampaignVO(campaignEntity));
		}

		return result;
	}

	@Override
	public CampaignVO getCampaign(Integer id) {
		CampaignEntity campaignEntity = campaignRepository.getCampaign(id);
		return voMapper.toCampaignVO(campaignEntity);
	}

	@Override
	public CampaignVO createCampaign(NewCampaignVO newCampaign) {

		// Convert from NewCampaignVO to CampaignEntity
		CampaignEntity campaignEntity = voMapper.toCampaignEntity(newCampaign);

		campaignRepository.createCampaign(campaignEntity);    

		return voMapper.toCampaignVO(campaignEntity);
	}

}
