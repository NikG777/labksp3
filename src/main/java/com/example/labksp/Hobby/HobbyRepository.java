package com.example.labksp.Hobby;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface HobbyRepository extends JpaRepository<Hobby, Long> {

    Hobby findById(long id);
    List<Hobby> findByName(String name);
    List<Hobby>  findAllByOrderById();

}
