package com.jayklef.locationdto.service;

import com.jayklef.locationdto.dto.UserLocationDto;
import com.jayklef.locationdto.model.User;
import com.jayklef.locationdto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDto> getAllUserLocations(){
        return userRepository.findAll()
                .stream()
                .map(user -> convertUserToUserLocationDTO(user))
                .collect(Collectors.toList());
    }

    private UserLocationDto convertUserToUserLocationDTO(User user){
        UserLocationDto userLocationDto = new UserLocationDto();
        userLocationDto.setFirstname(user.getFirstname());
        userLocationDto.setLastname(user.getLastname());
        userLocationDto.setEmail(user.getEmail());
        userLocationDto.setLatitude(user.getLocation().getLatitude());
        userLocationDto.setLongitude(user.getLocation().getLongitude());

        return userLocationDto;
    }
}
