package by.gal.handmade.jdbc.entity;

import java.util.Collection;
import java.util.UUID;

import by.gal.handmade.api.entity.IActivityType;
import by.gal.handmade.api.entity.IAddress;
import by.gal.handmade.api.entity.IArtisan;

public class Artisan extends AbstractEntity implements IArtisan {

	private String name;
	private String surname;
	private String patronymic;
	private Collection<IActivityType> activityTypes;
	private String avatarImageUrl;
	private IAddress address;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;		
	}

	@Override
	public String getSurname() {
		return surname;
	}

	@Override
	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String getPatronymic() {
		return patronymic;
	}

	@Override
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	@Override
	public Collection<IActivityType> getActivityTypes() {
		return activityTypes;
	}
	
	@Override
	public void setActivityTypes(Collection<IActivityType> activityTypes){
		this.activityTypes = activityTypes;
	}

	@Override
	public String getAvatarImageUrl() {
		return avatarImageUrl;
	}

	@Override
	public void setAvatarImageUrl(String url) {
		this.avatarImageUrl = url;
	}

	@Override
	public IAddress getAddress() {
		return address;
	}

	@Override
	public void setAddress(IAddress address) {
		this.address = address;
	}

	@Override
	public void addActivityType(IActivityType activityType) {
		activityTypes.add(activityType);		
	}

}
