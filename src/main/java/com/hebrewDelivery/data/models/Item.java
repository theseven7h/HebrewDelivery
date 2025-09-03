package com.hebrewDelivery.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Item {
    @Id
    private String itemId;
    private int weightInGrammes;
    private String description;
    private String senderName;
    @DBRef
    private TrackingInfos trackingInfos;
}
