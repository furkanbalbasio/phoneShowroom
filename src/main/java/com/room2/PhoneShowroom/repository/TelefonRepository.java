package com.room2.PhoneShowroom.repository;

import com.room2.PhoneShowroom.repository.entity.Marka;
import com.room2.PhoneShowroom.repository.entity.Model;
import com.room2.PhoneShowroom.repository.entity.Telefon;
import com.room2.PhoneShowroom.repository.view.VwTelefon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TelefonRepository extends JpaRepository<Telefon,Long> {

    @Query("select new com.room2.PhoneShowroom.repository.view.VwTelefon(t.id,t.yil,t.markaId,t.modelId) from Telefon t")
    List<Telefon> findAllFromTelefonView();

}
