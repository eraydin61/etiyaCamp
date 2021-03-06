package com.etiya.ReCapProject.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.ReCapProject.business.abstracts.IndividualCustomerService;
import com.etiya.ReCapProject.core.utilities.result.DataResult;
import com.etiya.ReCapProject.core.utilities.result.Result;
import com.etiya.ReCapProject.entities.concretes.IndividualCustomer;
import com.etiya.ReCapProject.entities.dtos.IndividualCustomerDetailDto;
import com.etiya.ReCapProject.entities.requests.delete.DeleteIndividualCustomerRequest;
import com.etiya.ReCapProject.entities.requests.update.UpdateIndividualCustomerRequest;

@RestController
@RequestMapping("api/individualcustomers")
public class IndividualCustomersController {
	private IndividualCustomerService individualCustomerService;

	@Autowired
	public IndividualCustomersController(IndividualCustomerService individualCustomerService) {
		super();
		this.individualCustomerService = individualCustomerService;
	}

	@GetMapping("/getAll")
	public DataResult<List<IndividualCustomer>> getAll() {
		return this.individualCustomerService.getAll();
	}
//
//	@GetMapping("/getbyid")
//	public DataResult<IndividualCustomer> getById(@RequestParam("customerId") int customerId) {
//		return this.individualCustomerService.getById(customerId);
//	}

	@GetMapping("/getIndividualCustomerDetailsById")
	public DataResult<IndividualCustomerDetailDto> getIndividualCustomerDetailsById(
			@RequestParam("individualCustomerId") int individualCustomerId) {
		return this.individualCustomerService.getIndividualCustomerDetailsById(individualCustomerId);
	}

	@PutMapping("/update")
	public Result update(@Valid @RequestBody UpdateIndividualCustomerRequest updateIndividualCustomerRequest) {
		return this.individualCustomerService.update(updateIndividualCustomerRequest);
	}

	@DeleteMapping("/delete")
	public Result delte(DeleteIndividualCustomerRequest deleteIndividualCustomerRequest) {
		return this.individualCustomerService.delete(deleteIndividualCustomerRequest);
	}
}

