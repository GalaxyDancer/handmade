package by.gal.handmade.jdbc.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import by.gal.handmade.api.entity.*;
import by.gal.handmade.jdbc.entity.*;

public class EntityBuilder {
	
	private static Map<Class<?>, Class<?>> map;
	
	private static Class<?> getClass(Class<?> interfaceType){
		
		if( map == null ){
			map = new HashMap<>();
			map.put(IAddress.class, Address.class);
			map.put(IActivityType.class, ActivityType.class);
			map.put(IArtisan.class, Artisan.class);
			map.put(ICity.class, City.class);
			map.put(ICountry.class, Country.class);
			map.put(IMenuItem.class, MenuItem.class);
			map.put(IRegion.class, Region.class);
			map.put(IUserRole.class, UserRole.class);
			map.put(IUser.class, User.class);
		}
		
		return map.get(interfaceType);
	}

	/**
	 * Creates instance of current implementation of the interface
	 * @param interfaceType to be implemented
	 * @return the new instance
	 */
	@SuppressWarnings("unchecked")
	public static <T extends IEntity> T createEntity(Class<T> interfaceType){
		T result = null;
		
		Class<?> c = getClass(interfaceType);
		if(c != null){
			Constructor<?> ctor = c.getConstructors()[0];	
			try {
				result = (T) ctor.newInstance();
				
				UUID id = UUID.randomUUID();
				result.setId(id);
				
				if( IArtisan.class == interfaceType ){
					Collection<IActivityType> activityTypes = new ArrayList<>();
					((Artisan)result).setActivityTypes(activityTypes);
				}
				else if( IMenuItem.class == interfaceType ){
					List<IMenuItem> childItems = new ArrayList<>();
					((MenuItem)result).setChildItems(childItems);
				}
				
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}			
		}

		
		return result;
	}
}
