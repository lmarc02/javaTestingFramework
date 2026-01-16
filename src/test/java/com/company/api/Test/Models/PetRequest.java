package com.company.api.Test.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
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

    public PetCategoryRequest getCategory() {
        return petCategoryRequest;
    }

    public void setCategory(PetCategoryRequest petCategoryRequest) {
        this.petCategoryRequest = petCategoryRequest;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<PetTagRequest> getTags() {
        return petTagRequests;
    }

    public void setTags(List<PetTagRequest> petTagRequests) {
        this.petTagRequests = petTagRequests;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

