package by.gal.handmade.jdbc.entity;

import by.gal.handmade.api.entity.IUserRole;


/**
 * @author Den Galax
 * @version 2016/05/24
 * Realitation of IUserRole
 */
public class UserRole extends AbstractEntity implements IUserRole {

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
