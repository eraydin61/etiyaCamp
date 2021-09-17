package com.etiya.ReCapProject.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.ReCapProject.business.abstracts.BrandService;
import com.etiya.ReCapProject.core.results.DataResult;
import com.etiya.ReCapProject.core.results.Result;
import com.etiya.ReCapProject.entities.concretes.Brand;
import com.etiya.ReCapProject.entities.requests.CreateBrandRequest;


@RestController
@RequestMapping("/api/brands")
public class BrandController {
	
	private BrandService brandService;
	
	@Autowired
	public BrandController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Brand>> getAll(){
		return this.brandService.getAll();
	}
	
	@GetMapping("/getById")
	public DataResult<Brand> getById(@RequestBody int brandId) {
		return this.brandService.getById(brandId);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CreateBrandRequest createBrandRequest) {
		return this.brandService.add(createBrandRequest);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CreateBrandRequest createBrandRequest) {
		return  this.brandService.update(createBrandRequest);
	}
	
	@PostMapping("/delete")
	public Result delete(int brandId) {
		return this.brandService.delete(brandId);
	}
}
