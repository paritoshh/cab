package com.lld.cab.exception;

public class CabAlreadyExists extends RuntimeException {
    public CabAlreadyExists(String cabAlreadyExists) {
        super(cabAlreadyExists);
    }
}
