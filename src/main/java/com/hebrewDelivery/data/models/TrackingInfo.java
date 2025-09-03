package com.hebrewDelivery.data.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TrackingInfo {
    private LocalDateTime createdAt;
    private String description;
}