package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class BaseDTO {
    @ApiModelProperty(required = false, hidden = true)
    private Long id;
    @ApiModelProperty(required = false, hidden = true)
    private String createdBy;
    @ApiModelProperty(required = false, hidden = true)
    private Date createdDate;
    @ApiModelProperty(required = false, hidden = true)
    private String lastModifiedBy;
    @ApiModelProperty(required = false, hidden = true)
    private Date lastModifiedDate;
    @ApiModelProperty(required = false, hidden = true)
    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
