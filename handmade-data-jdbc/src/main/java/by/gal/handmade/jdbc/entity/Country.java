package by.gal.handmade.jdbc.entity;

import java.util.UUID;

import by.gal.handmade.api.entity.ICountry;

/**
 * @author Den Galax
 * @version 2016/04/22
 * Implementation of Country entity
 */
public class Country implements ICountry {

	private UUID id;
	private String name;

	@Override
	public UUID getId() {
		return id;
	}

	@Override
	public void setId(UUID id) {
		this.id = id;		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;		
	}

}
