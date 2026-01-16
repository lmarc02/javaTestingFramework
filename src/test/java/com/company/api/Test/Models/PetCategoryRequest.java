package com.company.api.Test.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
public class PetCategoryRequest {
    @JsonProperty("id")
    Integer id;
    @JsonProperty("name")
    String name;
    public PetCategoryRequest(){}

    public PetCategoryRequest(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
