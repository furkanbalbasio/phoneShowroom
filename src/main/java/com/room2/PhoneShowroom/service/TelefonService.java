package com.room2.PhoneShowroom.service;

import com.room2.PhoneShowroom.dto.request.SaveTelefonRequestDto;
import com.room2.PhoneShowroom.dto.response.FindAllTelefonResponseDto;
import com.room2.PhoneShowroom.exception.ErrorType;
import com.room2.PhoneShowroom.exception.PhoneShowroomException;
import com.room2.PhoneShowroom.repository.TelefonRepository;
import com.room2.PhoneShowroom.repository.entity.Telefon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TelefonService {
    private final TelefonRepository repository;
    public void save(SaveTelefonRequestDto dto){
        if (dto.getYil()>2015){
            throw new PhoneShowroomException(ErrorType.BAD_REQUEST_ERROR);
        }
        repository.save(
                Telefon.builder()
                        .id(1L)
                        .markaId(1L)
                        .yil(2021)
                        .modelId(1L)
                        .build()
        );
    }

    public List<Telefon> findAll(){
        return repository.findAll();
    }
    public FindAllTelefonResponseDto findAllTelefon() {

        return FindAllTelefonResponseDto.builder()
                .statusCode(100)
                .message("telefon goruntulendi")
                .data(repository.findAllFromTelefonView())
                .build();
    }

}
