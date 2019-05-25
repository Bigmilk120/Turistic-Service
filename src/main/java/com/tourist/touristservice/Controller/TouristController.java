package com.tourist.touristservice.Controller;

import com.tourist.touristservice.Model.Tourist;
import com.tourist.touristservice.Repository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "tourist")
public class TouristController {
    @Autowired
    TouristRepository touristRepository;

    public void addTourist(Tourist tourist){
        touristRepository.save(tourist);
    }
}
