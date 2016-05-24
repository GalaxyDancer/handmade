package by.gal.handmade.api.entity;

/**
 * Interface of Region entity
 * @author Den Galax
 * @version 2016/04/21
 */
public interface IRegion extends IEntity {

    String getName();
    void setName(String name);
    ICountry getCountry();
    void setCountry(ICountry country);
    
}
