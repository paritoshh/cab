package com.lld.cab.service;


import com.lld.cab.exception.CabAlreadyExists;
import com.lld.cab.model.Cab;
import com.lld.cab.repository.CabRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CabService {
    CabRepository cabRepository;

    public Cab createCab(Cab cab){

        if(cabRepository.getCab(cab.getRegistrationNumber())!=null){
            throw new CabAlreadyExists("Cab already exists");
        }
        return cabRepository.addCab(cab);
    }
}
