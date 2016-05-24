package by.gal.handmade.mapper;

import by.gal.handmade.api.entity.IArtisan;
import by.gal.handmade.model.AbstractModel;
import by.gal.handmade.model.ArtisansListModel;

/**
 * @author Den Galax
 * @version 2016/05/14
 * Models mapper for Artisan entity
 */
public class ArtisanModelMapper extends AbstractModelMapper<IArtisan> {
    @Override
    protected AbstractModel createModel(IArtisan entity, Class<?> modelClass) {

        AbstractModel model = null;

        if( ArtisansListModel.class == modelClass ){
            model = new ArtisansListModel();
            model.setId(entity.getId().toString());
            ((ArtisansListModel)model).setName(entity.getSurname() + " " + entity.getName() + " " + entity.getPatronymic());
        }
        return model;
    }

    @Override
    public IArtisan getEntity(AbstractModel model) {
        return null;
    }
}
