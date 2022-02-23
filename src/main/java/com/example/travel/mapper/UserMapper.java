package com.example.travel.mapper;


import com.example.travel.dto.UserDTO;
import com.example.travel.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring")//,uses = PersonMapper.class
public interface UserMapper {//extends PersonMapper
    User toUserEntity(UserDTO dto);
    UserDTO toUserDTO(User user);
    List<User> toUserEntities(List<UserDTO> dtos);
    List<UserDTO> toUserDTOs(List<User> entites);
}
