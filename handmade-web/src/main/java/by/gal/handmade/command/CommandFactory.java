package by.gal.handmade.command;

import by.gal.handmade.constant.HttpRequestParameterName;
import by.gal.handmade.service.util.Utils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Den Galax
 * @version 2016/05/11
 * The factory of ICommand implementations
 */
public class CommandFactory {

    private static Map<CommandType, ICommand> commandMap;

    public static ICommand getCommand(HttpServletRequest request){
        ICommand result = null;
        CommandType commandType = null;

        String commandName = request.getParameter(HttpRequestParameterName.COMMAND);

        if(!Utils.isNullOrEmpty(commandName)){

            try {
                commandType = CommandType.valueOf(commandName.toUpperCase());
            } catch (IllegalArgumentException e) {
                commandType = CommandType.ERROR;
            }
        }
        else
            commandType = CommandType.INDEX;

        result = getCommand(commandType);

        return result;
    }

    private static ICommand getCommand(CommandType commandType){

        if( commandMap == null ){
            commandMap = new HashMap<>();
        }

        if( !commandMap.containsKey(commandType) ){
            switch (commandType){
                case INDEX :
                    commandMap.put(commandType, new IndexCommand());
                    break;
                case LOGIN :
                    commandMap.put(commandType, new LoginCommand());
                    break;
                case LOGOUT :
                    commandMap.put(commandType, new LogoutCommand());
                    break;
                case AUTORISATION:
                    commandMap.put(commandType, new AutorizeCommand());
                    break;
                case ARTISANS_LIST:
                    commandMap.put(commandType, new ArtisansListCommand());
                    break;
                default:
                    commandMap.put(commandType, new ErrorCommand());
            }
        }

        return commandMap.get(commandType);
    }
}
