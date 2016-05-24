package by.gal.handmade.command;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Den Galax
 * @version 2016/05/11
 * Interface of universal Command
 */
public interface ICommand {

    String execute(HttpServletRequest request);

}
