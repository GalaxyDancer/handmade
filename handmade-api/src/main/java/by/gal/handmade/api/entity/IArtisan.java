package by.gal.handmade.api.entity;

import java.util.Collection;

/**
 * Interface of Artisan entity
 * @author Den Galax
 * @version 2016/04/14
 */
public interface IArtisan extends IEntity {

    String getName();
    void setName(String name);
    String getSurname();
    void setSurname(String name);
    String getPatronymic();
    void setPatronymic(String name);
    void setActivityTypes(Collection<IActivityType> activityTypes);
    Collection<IActivityType> getActivityTypes();
    void addActivityType(IActivityType activityType);
    String getAvatarImageUrl();
    void setAvatarImageUrl(String url);
    IAddress getAddress();
    void setAddress(IAddress address);  
}