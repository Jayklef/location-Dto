package com.jayklef.locationdto.dto;

import lombok.Data;

@Data
public class UserLocationDto {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String place;
    private Double longitude;
    private Double latitude;
}
