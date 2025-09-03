package com.hebrewDelivery.services;

import com.hebrewDelivery.dtos.requests.SendItemRequest;
import com.hebrewDelivery.dtos.responses.SendItemResponse;

public interface ItemsService {
    SendItemResponse sendItem(SendItemRequest sendItemRequest);
}
