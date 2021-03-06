package com.etiya.ReCapProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.ReCapProject.entities.concretes.CardInformation;

public interface CardInformationDao extends JpaRepository<CardInformation, Integer>{
	
	List<CardInformation> getCardsInformationByApplicationUser_UserId(int applicationUserId);
	
	boolean existsByCardNumber(String cardNumber);
}
