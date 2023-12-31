package com.tobeto.spring.b.services.abstracts;

import com.tobeto.spring.b.entities.Brand;
import com.tobeto.spring.b.services.dtos.requests.brand.AddBrandRequest;
import com.tobeto.spring.b.services.dtos.requests.brand.UpdateBrandRequest;
import com.tobeto.spring.b.services.dtos.responses.brand.GetBrandListResponse;
import com.tobeto.spring.b.services.dtos.responses.brand.GetBrandResponse;

import java.util.List;

public interface BrandService {

    List<GetBrandListResponse> getByName(String name, int id);
    List<GetBrandListResponse> search(String name);
    GetBrandResponse getById(int id);
    void add(AddBrandRequest addBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);



}
