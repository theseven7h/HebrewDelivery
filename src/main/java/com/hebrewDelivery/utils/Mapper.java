package com.hebrewDelivery.utils;

import com.hebrewDelivery.dtos.requests.SendItemRequest;
import com.hebrewDelivery.dtos.responses.SendItemResponse;

public class Mapper {
    public static SendItemResponse map(SendItemRequest sendItemRequest) {
        SendItemResponse sendItemResponse = new SendItemResponse();
        return sendItemResponse;
    }
}
