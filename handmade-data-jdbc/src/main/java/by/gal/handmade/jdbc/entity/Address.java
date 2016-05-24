package by.gal.handmade.jdbc.entity;

import java.util.UUID;

import by.gal.handmade.api.entity.IAddress;
import by.gal.handmade.api.entity.ICity;

public class Address implements IAddress {

	private UUID id;
	private ICity city;
	private String street;
	private String building;
	private String room;
	
	@Override
	public UUID getId() {
		return id;
	}

	@Override
	public void setId(UUID id) {
		this.id = id;		
	}

	@Override
	public ICity getCity() {
		return city;
	}

	@Override
	public void setCity(ICity city) {
		this.city = city;

	}

	@Override
	public String getStreet() {
		return street;
	}

	@Override
	public void setStreet(String street) {
		this.street = street;

	}

	@Override
	public String getBuilding() {
		return building;
	}

	@Override
	public void setBuilding(String building) {
		this.building = building;
	}

	@Override
	public String getRoom() {
		return room;
	}

	@Override
	public void setRoom(String room) {
		this.room = room;
	}

}
