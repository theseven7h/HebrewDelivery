package com.hebrewDelivery.data.repositories;

import com.hebrewDelivery.data.models.TrackingInfos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingInfosRepo extends MongoRepository<TrackingInfos,String> {

}
