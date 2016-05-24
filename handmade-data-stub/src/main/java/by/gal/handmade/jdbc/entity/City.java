package by.gal.handmade.jdbc.entity;

import java.util.UUID;

import by.gal.handmade.api.entity.ICity;
import by.gal.handmade.api.entity.IRegion;

/**
 * @author Den Galax
 * @version 2016/04/22
 * Implementation of City entity
 */
public class City extends AbstractEntity implements ICity {

	private UUID id;
	private String name;
	private IRegion region;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;		
	}

	@Override
	public IRegion getRegion() {
		return region;
	}

	@Override
	public void setRegion(IRegion region) {
		this.region = region;
	}

}
