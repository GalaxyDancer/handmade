package by.gal.handmade.command;

import by.gal.handmade.constant.RoutePath;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Den Galax
 * @version 2016/05/12
 * Implementation of ICommand for LOGIN command
 */
public class LoginCommand implements ICommand {
    public String execute(HttpServletRequest request) {
        return RoutePath.LOGIN;
    }
}
