package com.samsung.sds.emarket.marketing.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.samsung.sds.emarket.marketing.repository.CampaignRepository;
import com.samsung.sds.emarket.marketing.repository.entity.CampaignEntity;
import com.samsung.sds.emarket.marketing.service.vo.CampaignVO;
import com.samsung.sds.emarket.marketing.service.vo.NewCampaignVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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
		log.info("listCampaigns");
		List<CampaignVO> result = new ArrayList<>();
//		// 내용 1
//        CampaignVO campaign = new CampaignVO();
//        campaign.setId(3);
//        campaign.setName("test name 3");
//        result.add(campaign);
//
//        // 내용 2
//        campaign = new CampaignVO();
//        campaign.setId(4);
//        campaign.setName("test name 4");
//        result.add(campaign);
		for (CampaignEntity campaignEntity : campaignRepository.listCampaigns()) {
//            CampaignVO campaign = new CampaignVO();
//            campaign.setId(campaignEntity.getId());
//            campaign.setName(campaignEntity.getName());
//            campaign.setFrom(campaignEntity.getFrom());
//            campaign.setTo(campaignEntity.getTo());
//            campaign.setPictureUri(campaignEntity.getPictureUri());
//            campaign.setDetailsUri(campaignEntity.getDetailsUri());
//            campaign.setDescription(campaignEntity.getDescription());
//            
//            result.add(campaign);
			if (log.isDebugEnabled()) {
                log.debug(campaignEntity.toString());
            }
			result.add(voMapper.toCampaignVO(campaignEntity));
        }
        return result;
	}

	@Override
	public CampaignVO getCampaign(Integer id) {
//		CampaignVO campaignVO = new CampaignVO();
//		campaignVO.setId(id);
//		campaignVO.setName("test campaign " + id);
//		return campaignVO;
		CampaignEntity campaignEntity = campaignRepository.getCampaign(id);
        return voMapper.toCampaignVO(campaignEntity);
	}
	
	@Override
	public CampaignVO createCampaign(NewCampaignVO newCampaign) {
//		CampaignVO campaignVO = new CampaignVO();
//        campaignVO.setId(100);
//        campaignVO.setDescription(newCampaign.getDescription());
//        campaignVO.setDetailsUri(newCampaign.getDetailsUri());
//        campaignVO.setFrom(newCampaign.getFrom());
//        campaignVO.setName(newCampaign.getName());
//        campaignVO.setPictureUri(newCampaign.getPictureUri());
//        campaignVO.setTo(newCampaign.getTo());
//        
//        return campaignVO;
		// Convert from NewCampaignVO to CampaignEntity
        CampaignEntity campaignEntity = voMapper.toCampaignEntity(newCampaign);
        campaignRepository.createCampaign(campaignEntity);
        return voMapper.toCampaignVO(campaignEntity);
	}

	@Override
	public CampaignVO updateCampaign(CampaignVO campaignVO) {
		CampaignEntity campaignEntity = campaignRepository.getCampaign(campaignVO.getId());
        
		if (campaignEntity == null) return null;
        
        campaignEntity = voMapper.toCampaignEntity(campaignVO);
        campaignRepository.updateCampaign(campaignEntity);        
                        
        return voMapper.toCampaignVO(campaignEntity);
	}

	@Override
	public boolean deleteCampaigns(int id) {
		boolean result = false;
        int delCnt = campaignRepository.deleteCampaigns(id);
        if (delCnt > 0) {
            result = true;
        }
        return result;
	}
}
