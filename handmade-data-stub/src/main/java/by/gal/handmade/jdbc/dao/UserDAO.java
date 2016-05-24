package by.gal.handmade.jdbc.dao;

import by.gal.handmade.api.entity.IUser;
import by.gal.handmade.api.entity.IUserRole;
import by.gal.handmade.jdbc.util.EntityBuilder;

/**
 * @author Den Galax
 * @version 2016/05/24
 * Data access object for User objects
 */
public class UserDAO extends AbstractEntityDAO<IUser> {

    private static UserDAO dao;

    public UserDAO() {
        IUser user1 = EntityBuilder.createEntity(IUser.class);
        user1.setLogin("admin");
        user1.setPassword("admin");
        UserRoleDAO dao = UserRoleDAO.getInstance();
        IUserRole adminRole = dao
                .getAll()
                .stream()
                .filter(r -> r.getName().equals("administrators"))
                .findFirst()
                .get();
        user1.setUserRole(adminRole);
        getEntitiesMap().put(user1.getId(), user1);

        IUser user2 = EntityBuilder.createEntity(IUser.class);
        user2.setLogin("user");
        user2.setPassword("user");
        IUserRole userRole = dao
                .getAll()
                .stream()
                .filter(r -> r.getName().equals("users"))
                .findFirst()
                .get();
        user2.setUserRole(userRole);
        getEntitiesMap().put(user2.getId(), user2);
    }

    public static synchronized UserDAO getInstance(){
        if( dao == null ){
            dao = new UserDAO();
        }
        return dao;
    }
}

