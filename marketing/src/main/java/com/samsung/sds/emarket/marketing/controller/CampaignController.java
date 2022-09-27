package com.samsung.sds.emarket.marketing.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.samsung.sds.emarket.marketing.api.CampaignsApi;
import com.samsung.sds.emarket.marketing.api.model.CampaignDTO;
import com.samsung.sds.emarket.marketing.api.model.NewCampaignDTO;
import com.samsung.sds.emarket.marketing.service.CampaignService;
import com.samsung.sds.emarket.marketing.service.vo.CampaignVO;

import io.swagger.annotations.Api;

@RestController
@Api(tags="Campaigns")
public class CampaignController implements CampaignsApi {

	private final CampaignService campaignService;
	
	private final DTOMapper dtoMapper;
	
	@Autowired
	public CampaignController(CampaignService campaignService, DTOMapper dtoMapper) {
		this.campaignService=campaignService;
		this.dtoMapper=dtoMapper;
	}
	
	@Override
	public ResponseEntity<CampaignDTO> getCampaign(Integer id) {
		CampaignVO campaignVO = campaignService.getCampaign(id);
		if(campaignVO == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok().body(dtoMapper.toCampaignDTO(campaignVO));
		}
	}

	@Override
	public ResponseEntity<List<CampaignDTO>> getCampaignList() {
        List<CampaignDTO> result = new ArrayList<>();
        for(CampaignVO campaignVo : campaignService.listCampaigns()) {
//            CampaignDTO campaignDto = new CampaignDTO();
//            campaignDto.setId(campaignVo.getId());
//            campaignDto.setDescription(campaignVo.getDescription());
//            campaignDto.setDetailsUri(campaignVo.getDetailsUri());
//            campaignDto.setFrom(campaignVo.getFrom());
//            campaignDto.setName(campaignVo.getName());
//            campaignDto.setPictureUri(campaignVo.getPictureUri());
//            campaignDto.setTo(campaignVo.getTo());
//            
//            result.add(campaignDto);
        	result.add(dtoMapper.toCampaignDTO(campaignVo));
    	}
        
        return ResponseEntity.ok().body(result);
	}

	@Override
	public ResponseEntity<CampaignDTO> postCampaign(@Valid NewCampaignDTO newCampaignDTO) {
//		CampaignDTO result = new CampaignDTO();
//        result.setId(100);
//        result.setName(newCampaignDTO.getName());
		CampaignVO campaignVO = campaignService.createCampaign(dtoMapper.toNewCampaignVO(newCampaignDTO));
	    CampaignDTO result = dtoMapper.toCampaignDTO(campaignVO);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}

	@Override
	public ResponseEntity<CampaignDTO> putCampaign(Integer id, @Valid NewCampaignDTO newCampaignDTO) {
//		CampaignDTO result = new CampaignDTO();
//        result.setId(300);
//        result.setDescription(newCampaignDTO.getDescription());
//        result.setDetailsUri(newCampaignDTO.getDetailsUri());
//        result.setFrom(newCampaignDTO.getFrom());
//        result.setName(newCampaignDTO.getName());
//        result.setPictureUri(newCampaignDTO.getPictureUri());
//        result.setTo(newCampaignDTO.getTo());
// 
//        return ResponseEntity.ok().body(result);
		
		
		// Convert from NewCampaignDTO to CampaignVO
//        CampaignVO campaign = dtoMapper.toCampaignVO(newCampaignDTO);
//        campaign.setId(id);
//        
//        CampaignVO result = campaignService.updateCampaign(campaign);
//        
//        return ResponseEntity.ok().body(dtoMapper.toCampaignDTO(result));
        
     // Convert from NewCampaignDTO to CampaignVO
        CampaignVO campaign = dtoMapper.toCampaignVO(newCampaignDTO);
        campaign.setId(id);
        
        CampaignVO result = campaignService.updateCampaign(campaign);
        if (result == null) {
            return ResponseEntity.notFound().build();
        } else {        
            return ResponseEntity.ok().body(dtoMapper.toCampaignDTO(result));
        }
	}

	@Override
	public ResponseEntity<Void> deleteCampaign(Integer id) {
		boolean result = campaignService.deleteCampaigns(id);
        if (result == true) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
	}
}
