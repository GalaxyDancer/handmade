package by.gal.handmade.api.entity;

/**
 * Interface of User role
 * @author Den Galax
 * @version 2016/05/24
 */
public interface IUser extends IEntity {
    String getLogin();
    void setLogin(String login);
    String getPassword();
    void setPassword(String password);
    IUserRole getUserRole();
    void setUserRole(IUserRole role);
}

