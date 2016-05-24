package by.gal.handmade.command;

import by.gal.handmade.constant.RoutePath;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Den Galax
 * @version 2016/05/11
 * Implementation of ICommand for INDEX command
 */
public class IndexCommand implements ICommand {
    public String execute(HttpServletRequest request) {
        return RoutePath.INDEX;
    }
}
