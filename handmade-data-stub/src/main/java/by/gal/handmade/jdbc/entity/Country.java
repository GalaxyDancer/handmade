package by.gal.handmade.jdbc.entity;

import java.util.UUID;

import by.gal.handmade.api.entity.ICountry;

/**
 * @author Den Galax
 * @version 2016/04/22
 * Implementation of Country entity
 */
public class Country extends AbstractEntity implements ICountry {

	private String name;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;		
	}

}
