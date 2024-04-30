package com.lld.cab.exception;

public class InvalidCabCreateRequest extends RuntimeException {
    public InvalidCabCreateRequest(String s) {
        super(s+"Invalid Cab Create");
    }
}
