package com.lld.cab.repository;

import com.lld.cab.model.Cab;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CabRepository {

    private static List<Cab> cabs = new ArrayList<Cab>();

    public Cab addCab(Cab cab){
        cabs.add(cab);
        return cab;
    }

    public Cab getCab(String registrationNumber){
        return cabs.stream().filter(cab-> cab.getRegistrationNumber().equals(registrationNumber)).findAny().orElse(null);
    }

    public List<Cab> getCabs(){
        return cabs;
    }
}
