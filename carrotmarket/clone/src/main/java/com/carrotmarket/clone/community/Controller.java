package com.carrotmarket.clone.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carrotmarket.clone.community.bean.Owner;
import com.carrotmarket.clone.community.bean.Post;
import com.carrotmarket.clone.community.bean.Seeker;
import com.carrotmarket.clone.repository.OwnerRepository;
import com.carrotmarket.clone.repository.PostRepository;
import com.carrotmarket.clone.repository.SeekerRepository;

@RestController
public class Controller {
    
    @Autowired
    private OwnerRepository owRepository;
    @GetMapping("/owner")
    public List<Owner> getAllOwner(){
        return owRepository.findAll();
    }

    @Autowired
    private SeekerRepository skRepository;
    @GetMapping("/seeker")
    public List<Seeker> getAllSeeker(){
        return skRepository.findAll();
    }

    @Autowired
    private PostRepository poRepository;
    @GetMapping("/post")
    public List<Post> getAllPost(){
        return poRepository.findAll();
    }
}
