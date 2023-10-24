package com.jayklef.locationdto.controller;

import com.jayklef.locationdto.dto.UserLocationDto;
import com.jayklef.locationdto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user-location")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<UserLocationDto> getAllUserLocations(){
        return userService.getAllUserLocations();
    }
}
