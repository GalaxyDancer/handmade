package by.gal.handmade.jdbc.entity;

import java.util.UUID;

import by.gal.handmade.api.entity.IActivityType;

/**
 * @author Den Galax
 * @version 2016/04/22
 * Implementation of ActivityType entity
 */
public class ActivityType extends AbstractEntity implements IActivityType {

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
