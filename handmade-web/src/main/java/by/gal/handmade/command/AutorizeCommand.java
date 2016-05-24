package by.gal.handmade.command;

import by.gal.handmade.api.entity.IUser;
import by.gal.handmade.constant.HttpRequestParameterName;
import by.gal.handmade.constant.HttpSessionParameterName;
import by.gal.handmade.constant.RoutePath;
import by.gal.handmade.service.data.RepositoryFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Den Galax
 * @version 2016/05/24
 * Implementation of ICommand for user autorisation command
 */
public class AutorizeCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {

        String name = request.getParameter(HttpRequestParameterName.NAME);
        String password = request.getParameter(HttpRequestParameterName.PASSWORD);
        String page = "";

        IUser user = RepositoryFactory
                .getRepository()
                .getAll(IUser.class)
                .stream()
                .filter(u -> u.getLogin().equals(name))
                .findFirst()
                .get();

        if( user != null ){
            if( user.getPassword().equals(password)){
                page = RoutePath.INDEX;
                HttpSession session = request.getSession();
                session.setAttribute(HttpSessionParameterName.USER_ID, user.getId());
                if( user.getUserRole() != null )
                    session.setAttribute(HttpSessionParameterName.USER_TYPE, user.getUserRole().getName());
            }
            else{
                page = RoutePath.LOGIN;
            }
        }

        return page;
    }
}
