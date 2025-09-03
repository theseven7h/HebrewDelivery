package com.hebrewDelivery.services.impl;

import com.hebrewDelivery.data.repositories.Items;
import com.hebrewDelivery.dtos.requests.SendItemRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemsServiceImplTest {
    @Autowired
    ItemsServiceImpl itemsService;
    @Autowired
    Items items;

    @Test
    void testSendItem_countIsOne(){
        SendItemRequest sendItemRequest = new SendItemRequest();
        itemsService.sendItem(sendItemRequest);
        assertEquals(1, items.count());
    }
}