package com.room2.PhoneShowroom.service;

import com.room2.PhoneShowroom.dto.request.SaveModelRequestDto;
import com.room2.PhoneShowroom.dto.request.SaveTelefonRequestDto;
import com.room2.PhoneShowroom.exception.ErrorType;
import com.room2.PhoneShowroom.exception.PhoneShowroomException;
import com.room2.PhoneShowroom.repository.ModelRepository;
import com.room2.PhoneShowroom.repository.entity.Model;
import com.room2.PhoneShowroom.repository.entity.Telefon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepository repository;
    public void save(SaveModelRequestDto dto){
        if (dto.getName()!=null){
            throw new PhoneShowroomException(ErrorType.BAD_REQUEST_ERROR);
        }
        repository.save(
                Model.builder()
                        .id(1L)
                        .name("S20")
                        .build()
        );
    }

}
