package com.lld.cab.model;

import lombok.Data;

@Data
public class Location {

    private int x;
    private int y;

    public Double getDistance(Location l2){
        return Math.sqrt(
                Math.pow(this.x-l2.x, 2) + Math.pow(this.y-l2.y, 2)
        );
    }
}
