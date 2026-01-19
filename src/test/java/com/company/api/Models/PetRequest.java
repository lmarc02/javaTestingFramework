package com.company.api.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class PetRequest {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("category")
    private PetCategoryRequest petCategoryRequest;
    @JsonProperty("name")
    private String name;
    @JsonProperty("photoUrls")
    private List<String> photoUrls;
    @JsonProperty("tags")
    private List<PetTagRequest> petTagRequests;
    @JsonProperty("status")
    private String status;
    public PetRequest(){}
    public PetRequest(Integer id, PetCategoryRequest petCategoryRequest, List<String> photoUrls, String name, List<PetTagRequest> petTagRequests, String status) {
        this.id = id;
        this.petCategoryRequest = petCategoryRequest;
        this.photoUrls = photoUrls;
        this.name = name;
        this.petTagRequests = petTagRequests;
        this.status = status;
    }

}

