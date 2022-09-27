package com.samsung.sds.demo.respository.entity;

import java.io.Serializable;
import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CampaignEntity implements Serializable {
    private int id;

    private String  name;

    private String description;

    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime from;

    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime to;

    private String pictureUri;

    private String detailsUri;    
}
