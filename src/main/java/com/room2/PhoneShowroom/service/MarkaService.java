package com.room2.PhoneShowroom.service;

import com.room2.PhoneShowroom.dto.request.SaveMarkaRequestDto;
import com.room2.PhoneShowroom.dto.request.SaveModelRequestDto;
import com.room2.PhoneShowroom.exception.ErrorType;
import com.room2.PhoneShowroom.exception.PhoneShowroomException;
import com.room2.PhoneShowroom.repository.MarkaRepository;
import com.room2.PhoneShowroom.repository.entity.Marka;
import com.room2.PhoneShowroom.repository.entity.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarkaService {
    private final MarkaRepository repository;
    public void save(SaveMarkaRequestDto dto){
        if (dto.getName()!=null){
            throw new PhoneShowroomException(ErrorType.BAD_REQUEST_ERROR);
        }
        repository.save(
                Marka.builder()
                        .id(1L)
                        .name("Samsung")
                        .build()
        );
    }
}
