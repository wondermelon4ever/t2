package com.samsung.sds.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.samsung.sds.demo.api.CampaignsApi;
import com.samsung.sds.demo.api.model.CampaignDTO;
import com.samsung.sds.demo.service.CampaignService;
import com.samsung.sds.demo.service.vo.CampaignVO;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import io.swagger.annotations.Api;

@Controller
@Api(tags = "Campaigns")
public class CampaignsApiController implements CampaignsApi {
    private CampaignService campaignService;    

    private DTOMapper dtoMapper;

    public CampaignsApiController(CampaignService campaignService, DTOMapper dtoMapper) {
        this.campaignService = campaignService;
        this.dtoMapper = dtoMapper;
    }


    @Override
    public ResponseEntity<List<CampaignDTO>> getCampaignList(Integer pageSize, Integer pageIndex) {

        List<CampaignDTO> result = new ArrayList<CampaignDTO>();

        for (CampaignVO campaign : campaignService.listCampaigns()) {
            CampaignDTO dto = dtoMapper.toCampaignDTO(campaign);
            result.add(dto);
        }        
        
        return ResponseEntity.ok().body(result);
    }
    
}
