package com.company.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

}
