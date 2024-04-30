package com.lld.cab.controller;


import com.lld.cab.dto.CabDto;
import com.lld.cab.exception.InvalidCabCreateRequest;
import com.lld.cab.model.Cab;
import com.lld.cab.service.CabService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

@RequestMapping("/cab")
public class CabController {

    CabService cabService;

    @PostMapping
    public Cab addCab(@RequestBody CabDto cabRequest) {

        if(!validateCab(cabRequest)){
            throw new InvalidCabCreateRequest("Cab request is invalid");
        }
        return cabService.createCab(cabRequest.toCab());

    }

    private Boolean validateCab(CabDto cabRequest) {
        return (cabRequest.getDriverId()!=null && cabRequest.getLocation()!=null);
    }




}
