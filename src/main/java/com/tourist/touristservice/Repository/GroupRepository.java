package com.tourist.touristservice.Repository;

import com.tourist.touristservice.Model.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Group, String> {
}
