package com.samsung.sds.demo.respository;

import java.util.List;

import com.samsung.sds.demo.respository.entity.CampaignEntity;

public interface CampaignRepository {
    List<CampaignEntity> listCampaigns();
}