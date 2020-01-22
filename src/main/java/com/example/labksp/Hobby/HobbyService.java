package com.example.labksp.Hobby;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbyService {
    @Autowired
    private HobbyRepository repo;

    public List<Hobby> listAll()
    {
        return repo.findAllByOrderById();
    }
    public void save(Hobby hobby)
    {
        repo.save(hobby);
    }
    public Hobby get(long id)
    {
        return repo.findById(id);
    }
    public Page viewPage(int page)
    {
        return repo.findAll(PageRequest.of(page,15, Sort.by(Sort.Direction.ASC, "id")));
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