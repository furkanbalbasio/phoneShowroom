package com.room2.PhoneShowroom.utillity.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@RequiredArgsConstructor
public class ServiceManager<T,ID> implements IService<T,ID>{

    private final JpaRepository<T,ID> repository;
    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public Iterable<T> saveAll(Iterable<T> entities) {
        return repository.saveAll(entities);
    }

    @Override
    public T update(T entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(T t) {
        repository.delete(t);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }
}
