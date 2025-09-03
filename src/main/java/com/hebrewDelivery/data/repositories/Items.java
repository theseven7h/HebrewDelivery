package com.hebrewDelivery.data.repositories;

import com.hebrewDelivery.data.models.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Items extends MongoRepository<Item, String> {

}
