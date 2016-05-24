package by.gal.handmade.api.entity;

/**
 * Interface of City entity
 * @author Den Galax
 * @version 2016/04/21
 */
public interface ICity extends IEntity {
	
    String getName();
    void setName(String name);
    IRegion getRegion();
    void setRegion(IRegion region);
    
}
