package com.samsung.sds.emarket.marketing.repository.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.samsung.sds.emarket.marketing.repository.CampaignRepository;
import com.samsung.sds.emarket.marketing.repository.entity.CampaignEntity;

@Mapper
public interface CampaignRepositoryDao extends CampaignRepository {
	@Select("select id, `name`, description, `From`, `to`, pictureUri, detailsUri from campaigns")
	public List<CampaignEntity> listCampaigns(); 

	@Select("select id, `name`, description, `From`, `to`, pictureUri, detailsUri from campaigns where id = #{id}")
	public CampaignEntity getCampaign(int id);


	@Insert(
			"insert into `campaigns` (`name`, description, `From`, `to`, pictureUri, detailsUri)" +
					"values (#{name}, #{description}, #{from}, #{to}, #{pictureUri}, #{detailsUri})"
			)
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public int createCampaign(CampaignEntity entity);
}
