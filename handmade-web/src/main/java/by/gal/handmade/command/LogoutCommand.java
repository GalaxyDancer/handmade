package by.gal.handmade.command;

import by.gal.handmade.constant.RoutePath;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Den Galax
 * @version 2016/05/12
 * Implementation of ICommand for LOGOUT command
 */
public class LogoutCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {
        request.getSession().invalidate();
        return RoutePath.INDEX;
    }
}
