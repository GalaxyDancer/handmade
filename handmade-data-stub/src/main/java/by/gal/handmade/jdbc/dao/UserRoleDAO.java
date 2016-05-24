package by.gal.handmade.jdbc.dao;

import by.gal.handmade.api.entity.IArtisan;
import by.gal.handmade.api.entity.IMenuItem;
import by.gal.handmade.api.entity.IUserRole;
import by.gal.handmade.jdbc.entity.UserRole;
import by.gal.handmade.jdbc.util.EntityBuilder;

/**
 * @author Den Galax
 * @version 2016/05/24
 * Data access object for UserRole objects
 */
public class UserRoleDAO extends AbstractEntityDAO<IUserRole> {

    private static UserRoleDAO dao;

    public UserRoleDAO() {
        IUserRole role1 = EntityBuilder.createEntity(IUserRole.class);
        role1.setName("administrators");
        getEntitiesMap().put(role1.getId(), role1);

        IUserRole role2 = EntityBuilder.createEntity(IUserRole.class);
        role2.setName("users");
        getEntitiesMap().put(role2.getId(), role2);
    }

    public static synchronized UserRoleDAO getInstance(){
        if( dao == null ){
            dao = new UserRoleDAO();
        }
        return dao;
    }

}
