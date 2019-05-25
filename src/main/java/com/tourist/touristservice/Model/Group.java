package com.tourist.touristservice.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "group")
public class Group {
    @Id
    private int id;
    private List<Tourist> listOfTourists;
    private String pickUpPlace;
    private int pickUpHour;
    private int pickUpMinute;
    private String additionalInfo;
    private String typeOfSightseeing;
}
