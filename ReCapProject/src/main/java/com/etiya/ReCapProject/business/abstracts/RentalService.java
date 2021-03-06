package com.etiya.ReCapProject.business.abstracts;

import java.util.Date;
import java.util.List;

import com.etiya.ReCapProject.core.utilities.result.DataResult;
import com.etiya.ReCapProject.core.utilities.result.Result;
import com.etiya.ReCapProject.entities.concretes.Rental;
import com.etiya.ReCapProject.entities.dtos.RentalDetailDto;
import com.etiya.ReCapProject.entities.requests.CarReturnedRequest;
import com.etiya.ReCapProject.entities.requests.create.CreateRentalRequest;
import com.etiya.ReCapProject.entities.requests.delete.DeleteRentalRequest;
import com.etiya.ReCapProject.entities.requests.update.UpdateRentalRequest;

public interface RentalService {
	
	DataResult<List<Rental>> getAll();

	DataResult<Rental> getById(int rentalId);

	DataResult<RentalDetailDto> getRentalDetailsByRentalId(int rentalId);
	
	DataResult<List<RentalDetailDto>> getRentalsDetailByApplicationUserId(int applicationUserId);

	Result add(CreateRentalRequest createRentalRequest);

	Result update(UpdateRentalRequest updateRentalRequest);

	Result delete(DeleteRentalRequest deleteRentalRequest);

	Result carAtRentalReturnedIsTrue(CarReturnedRequest carReturnedRequest);
	
	DataResult<Double> getRentalAdditionalTotalPrice(int rentalAdditionalId, Date minDate, Date maxDate);
	
	
}
