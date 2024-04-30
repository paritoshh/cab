package com.lld.cab.model;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Cab {

    private String registrationNumber;
    private String driverName;
    private Location currentLocation;
    private Long driverId;
}
