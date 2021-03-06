package com.etiya.ReCapProject.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler","rentals"})
@Table(name = "cars")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "car_id")
	private int carId;

	@Column(name = "car_name")
	private String carName;

	@Column(name = "model_year")
	private String modelYear;

	@Column(name = "daily_price")
	private double dailyPrice;

	@Column(name = "description")
	private String description;
	
	@Column(name = "kilometer")
	private long kilometer;
	
	@Column(name = "min_findeks_score")
	private int minFindeksScore;
	
	@Column(name = "is_listed")
	private boolean isListed = true;
	
	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;

	@ManyToOne
	@JoinColumn(name = "color_id")
	private Color color;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@OneToMany(mappedBy = "car",cascade = CascadeType.ALL)
	private List<CarImage> carImages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "car")
	private List<Rental> rentals;
	
	@JsonIgnore
	@OneToMany(mappedBy = "car")
	private List<CarMaintenance> carMaintenance;
	
	@JsonIgnore
	@OneToMany(mappedBy = "car",cascade = CascadeType.ALL)
	private List<CarDamageInformation> CarDmageInformations;
}
