package com.example.labksp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {
    @Autowired
    private PlaceRepository repo;

    public List<Place> listAll()
    {
        return repo.findAll();
    }
    public void save(Place place)
    {
        repo.save(place);
    }
    public Place get(long id)
    {
        return repo.findById(id);
    }
    public Page viewPage(int page)
    {
        return repo.findAll(PageRequest.of(page,15));
    }
    public void delete(long id)
    {
        repo.deleteById(id);
    }
//    public void update(Long id,Places place)
//    {
//        Places place_new = repo.findById(id).get();
//        place_new.
//
//    }
}