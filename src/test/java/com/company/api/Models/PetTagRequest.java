package com.company.api.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetTagRequest {
    @JsonProperty("id")
    Integer id;
    @JsonProperty("name")
    String name;
    public PetTagRequest(){}

    public PetTagRequest(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}
