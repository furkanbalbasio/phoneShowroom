package com.room2.PhoneShowroom.dto.response;

import com.room2.PhoneShowroom.repository.entity.Marka;
import com.room2.PhoneShowroom.repository.entity.Model;
import com.room2.PhoneShowroom.repository.entity.Telefon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FindAllTelefonResponseDto {
    int statusCode;
    String message;
    int currentPage;
    boolean hasNext;
    List<Telefon> data;
}
