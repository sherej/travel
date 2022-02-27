package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.UserDTO;
import com.example.travel.entity.User;
import com.example.travel.mapper.UserMapper;
import com.example.travel.repository.UserRepository;
import com.example.travel.service.iservice.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserDTO,Long> implements UserService {

    private final UserRepository repo;

    private final UserMapper mapper;

    public UserServiceImpl(UserRepository repo, UserMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<User, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<User, UserDTO> getMapper() {
        return mapper;
    }
}
