package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO extends PersonDTO{
    @ApiModelProperty(required = true)
    private String email;

    @ApiModelProperty(required = true)
    private String phone;

    @ApiModelProperty(required = true)
    private String userName;

    @ApiModelProperty(required = true)
    private String password;

    @ApiModelProperty(required = true)
    private String address;

}
