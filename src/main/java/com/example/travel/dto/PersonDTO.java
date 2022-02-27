package com.example.travel.dto;

import com.example.travel.common.enums.Gender;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonDTO {

    @ApiModelProperty(required = true)
    private String firstName;
    @ApiModelProperty(required = true)
    private String lastName;
    @ApiModelProperty(required = true)
    private String nationalCode;
    @ApiModelProperty(required = true)
    private Date birthDay;
    @ApiModelProperty(required = true)
    private Gender gender;


}
