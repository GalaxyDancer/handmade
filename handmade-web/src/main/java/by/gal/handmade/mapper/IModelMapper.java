package by.gal.handmade.mapper;

import by.gal.handmade.model.AbstractModel;

/**
 * @author Den Galax
 * @version 2016/05/14
 * Models mapper interface
 */
public interface IModelMapper<TEntityClass> {

    <T extends AbstractModel> T getModel(TEntityClass entity, Class<T> modelClass);
    TEntityClass getEntity(AbstractModel model);
}
