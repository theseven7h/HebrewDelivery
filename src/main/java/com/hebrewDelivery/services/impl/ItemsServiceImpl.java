package com.hebrewDelivery.services.impl;

import com.hebrewDelivery.data.models.Item;
import com.hebrewDelivery.data.repositories.Items;
import com.hebrewDelivery.dtos.requests.SendItemRequest;
import com.hebrewDelivery.dtos.responses.SendItemResponse;
import com.hebrewDelivery.services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.hebrewDelivery.utils.Mapper.map;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    Items items;
    @Override
    public SendItemResponse sendItem(SendItemRequest sendItemRequest) {
        Item item = new Item();
        SendItemResponse sendItemResponse = map(sendItemRequest);
        items.save(item);
        return null;
    }
}
