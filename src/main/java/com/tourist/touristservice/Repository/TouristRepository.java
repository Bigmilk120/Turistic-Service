package com.tourist.touristservice.Repository;


import com.tourist.touristservice.Model.Tourist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TouristRepository extends MongoRepository<Tourist, String> {
}
