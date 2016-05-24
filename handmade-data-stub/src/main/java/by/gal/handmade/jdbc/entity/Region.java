package by.gal.handmade.jdbc.entity;

import java.util.UUID;

import by.gal.handmade.api.entity.ICountry;
import by.gal.handmade.api.entity.IRegion;

/**
 * @author Den Galax
 * @version 2016/04/22
 * Implementation of Region entity
 */
public class Region extends AbstractEntity implements IRegion {

	private String name;
	private ICountry country;


	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;		
	}

	@Override
	public ICountry getCountry() {
		return country;
	}

	@Override
	public void setCountry(ICountry country) {
		this.country = country;

	}

}
