package com.example.labksp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PlaceRepository extends JpaRepository<Place, Long> {

    Place findById(long id);
    List<Place> findByName(String name);

}
