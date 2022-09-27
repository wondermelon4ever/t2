package com.samsung.sds.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.samsung.sds.demo.respository.CampaignRepository;
import com.samsung.sds.demo.respository.entity.CampaignEntity;
import com.samsung.sds.demo.service.vo.CampaignVO;

import org.springframework.stereotype.Service;

@Service
public class CampaignServiceImpl implements CampaignService {
    private final CampaignRepository campaignRepository;

    private final VOMapper voMapper;

    public CampaignServiceImpl(CampaignRepository campaignRepository, VOMapper voMapper) {
        this.campaignRepository = campaignRepository;
        this.voMapper = voMapper;
    }

    @Override
    public List<CampaignVO> listCampaigns() {        
        List<CampaignVO> result = new ArrayList<CampaignVO>();

        List<CampaignEntity> list = campaignRepository.listCampaigns();
        for (CampaignEntity campaignEntity : list) {            
            result.add(voMapper.toCampaignVO(campaignEntity));
        }

        return result;
    }
    
}
