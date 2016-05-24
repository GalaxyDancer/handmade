package by.gal.handmade.command;

import by.gal.handmade.api.entity.IArtisan;
import by.gal.handmade.api.service.IRepository;
import by.gal.handmade.constant.RoutePath;
import by.gal.handmade.mapper.ModelMapperFactory;
import by.gal.handmade.model.ArtisansListModel;
import by.gal.handmade.service.data.RepositoryFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Den Galax
 * @version 2016/05/14
 * Implementation of ICommand for ARTISANS_LIST command
 */
public class ArtisansListCommand implements ICommand {
    @Override
    public String execute(HttpServletRequest request) {

        IRepository repository = RepositoryFactory.getRepository();
        List<IArtisan> list = repository.getAll(IArtisan.class);
        List<ArtisansListModel> models = list
                .stream()
                .map(a -> ModelMapperFactory.getMapper(IArtisan.class).getModel(a, ArtisansListModel.class))
                .collect(Collectors.toList());
//        List<String> models = list
//                .stream()
//                .map(a -> a.getName())
//                .collect(Collectors.toList());
        request.setAttribute("models", models);

        return RoutePath.ARTISANS_LIST;
    }
}
