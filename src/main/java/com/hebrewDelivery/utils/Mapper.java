package com.hebrewDelivery.utils;

import com.hebrewDelivery.data.models.Item;
import com.hebrewDelivery.dtos.requests.SendItemRequest;
import com.hebrewDelivery.dtos.responses.SendItemResponse;

public class Mapper {
    public static Item map(SendItemRequest sendItemRequest) {
        Item item = new Item();
        SendItemResponse sendItemResponse = new SendItemResponse();
        return item;
    }
}
