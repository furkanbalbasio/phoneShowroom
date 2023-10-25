package com.room2.PhoneShowroom.exception;

import lombok.Getter;

@Getter
public class PhoneShowroomException extends  RuntimeException{
    private final ErrorType errorType;

    public PhoneShowroomException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }
    public PhoneShowroomException(ErrorType errorType, String message){
        super(message);
        this.errorType=errorType;
    }
}
