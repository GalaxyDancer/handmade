package by.gal.handmade.api.entity;

/**
 * Interface of Address entity
 * @author Den Galax
 * @version 2016/04/21
 */
public interface IAddress extends IEntity {

	ICity getCity();
	void setCity(ICity city);
	String getStreet();
	void setStreet(String street);
	String getBuilding();
	void setBuilding(String building);
	String getRoom();
	void setRoom(String room);
	
}
