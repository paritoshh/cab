package com.lld.cab.dto;


import com.lld.cab.model.Cab;
import com.lld.cab.model.Location;
import lombok.Getter;

import static com.lld.cab.model.Cab.*;

@Getter
public class CabDto {

    private String registrationNumber;
    private String driverName;
    private Long driverId;
    private Location location;


    public Cab toCab(){
        return builder()
                .registrationNumber(registrationNumber)
                .currentLocation(location)
                .driverName(driverName)
                .driverId(driverId)
                .build();
    }

}
