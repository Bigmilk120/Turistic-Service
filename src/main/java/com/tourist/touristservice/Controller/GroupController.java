package com.tourist.touristservice.Controller;

import com.tourist.touristservice.Repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "group")
public class GroupController {
    @Autowired
    GroupRepository groupRepository;
}
