package com.example.travel.dto;

import com.example.travel.common.enums.CompanyType;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyDTO  {//extends BaseDTO

    @ApiModelProperty(required = true)
    private String name;
    @ApiModelProperty(required = true)
    private CompanyType type;
    @ApiModelProperty(required = true)
    private CityDTO city;
    @ApiModelProperty(required = true)
    private String address;

}
