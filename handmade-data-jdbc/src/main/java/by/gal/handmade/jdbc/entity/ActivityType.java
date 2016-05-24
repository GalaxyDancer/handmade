package by.gal.handmade.jdbc.entity;

import java.util.UUID;

import by.gal.handmade.api.entity.IActivityType;

/**
 * @author Den Galax
 * @version 2016/04/22
 * Implementation of ActivityType entity
 */
public class ActivityType implements IActivityType {
	
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
