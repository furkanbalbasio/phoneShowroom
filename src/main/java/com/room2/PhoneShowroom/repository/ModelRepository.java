package com.room2.PhoneShowroom.repository;

import com.room2.PhoneShowroom.repository.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Long> {
}
