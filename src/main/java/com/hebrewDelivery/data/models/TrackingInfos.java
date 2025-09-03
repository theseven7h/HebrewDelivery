package com.hebrewDelivery.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class TrackingInfos {
    @Id
    private String trackingId;
    private String itemId;
    private List<TrackingInfo> trackingInfos;
}