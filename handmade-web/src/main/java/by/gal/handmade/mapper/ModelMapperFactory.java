package by.gal.handmade.mapper;

import by.gal.handmade.api.entity.IArtisan;
import by.gal.handmade.api.entity.IEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Den Galax
 * @version 2016/05/14
 * Models mapper factory
 */
public class ModelMapperFactory {

    private static Map<Class<? extends IEntity>, IModelMapper<? extends IEntity>> mappers;

    public static <T extends IEntity> IModelMapper<T> getMapper(Class<T> entityClass){

        if( mappers == null ){
            mappers = new HashMap<>();
            mappers.put(IArtisan.class, new ArtisanModelMapper());
        }

        return (IModelMapper<T>) mappers.get(entityClass);
    }
}
