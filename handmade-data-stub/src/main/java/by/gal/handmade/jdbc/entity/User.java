package by.gal.handmade.jdbc.entity;

import by.gal.handmade.api.entity.IUser;
import by.gal.handmade.api.entity.IUserRole;

/**
 * @author Den Galax
 * @version 2016/05/24
 * Realitation of IUser
 */
public class User extends AbstractEntity implements IUser {

    private String login;
    private String password;
    private IUserRole role;
    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public IUserRole getUserRole() {
        return role;
    }

    @Override
    public void setUserRole(IUserRole role) {
        this.role = role;
    }
}
