package com.example.travel.mapper;


import com.example.travel.common.BaseMapper;
import com.example.travel.dto.UserDTO;
import com.example.travel.entity.User;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<User,UserDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget User entity, UserDTO dto);
//    User toUserEntity(UserDTO dto);
//    UserDTO toUserDTO(User user);
//    List<User> toUserEntities(List<UserDTO> dtos);
//    List<UserDTO> toUserDTOs(List<User> entites);
}
