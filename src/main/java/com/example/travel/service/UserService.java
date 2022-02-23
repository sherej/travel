package com.example.travel.service;

import com.example.travel.entity.Country;
import com.example.travel.entity.User;
import com.example.travel.repository.UserRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IService<User>{

    private UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public User save(Long parentId, User object) {
        return null;
    }

    @Override
    public User save(Long parentOneId, Long parentTwoId, User object) {
        return null;
    }

    @Override
    public User save(Long parentOneId, Long parentTwoId, Long parentThreeId, User object) {
        return null;
    }

    @Override
    public User save(User object) {
        return repo.save(object);
    }

    @Override
    public List<User> findByParentId(Long parentId) {
        return null;
    }

    @Override
    public List<User> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return (List<User>)repo.findAll();
    }
}
