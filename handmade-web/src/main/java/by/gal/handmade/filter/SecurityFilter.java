package by.gal.handmade.filter;


import by.gal.handmade.command.CommandType;
import by.gal.handmade.constant.HttpRequestParameterName;
import by.gal.handmade.constant.HttpSessionParameterName;
import by.gal.handmade.constant.RoutePath;
import by.gal.handmade.service.util.Utils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/Home", "/home", "/"})
public class SecurityFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        HttpSession session = httpRequest.getSession();

        String userRole = (String) session.getAttribute(HttpSessionParameterName.USER_TYPE);
        String commandName = httpRequest.getParameter(HttpRequestParameterName.COMMAND);

        CommandType command = CommandType.valueOf(commandName);

        if ( !Utils.isNullOrEmpty(userRole) && userRole.equals("administrators")){
            filterChain.doFilter(servletRequest, servletResponse);
        }
        else if ( command == CommandType.LOGIN
                || command == CommandType.AUTORISATION
                || command == CommandType.INDEX
                || command == CommandType.ERROR)
        {
            filterChain.doFilter(servletRequest, servletResponse);
        }
        else{
            RequestDispatcher dispatcher = httpRequest.getRequestDispatcher(RoutePath.LOGIN);
            dispatcher.forward(httpRequest, httpResponse);
            //session.invalidate();
            //httpResponse.sendRedirect(RoutePath.LOGIN);
        }
    }

    @Override
    public void destroy() {

    }
}
