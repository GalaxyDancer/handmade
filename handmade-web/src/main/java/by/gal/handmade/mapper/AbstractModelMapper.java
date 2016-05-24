package by.gal.handmade.mapper;

import by.gal.handmade.model.AbstractModel;

/**
 * @author Den Galax
 * @version 2016/05/14
 * Models mapper base abstract class
 */
public abstract class AbstractModelMapper<TEntityClass> implements IModelMapper<TEntityClass> {
    @Override
    public <T extends AbstractModel> T getModel(TEntityClass entity, Class<T> modelClass) {
        T model = null;

        if( entity != null ){
            model = (T) createModel(entity, modelClass);
        }
        return model;
    }

    @Override
    public abstract TEntityClass getEntity(AbstractModel model);

    protected abstract AbstractModel createModel(TEntityClass entity, Class<?> modelClass);
}
