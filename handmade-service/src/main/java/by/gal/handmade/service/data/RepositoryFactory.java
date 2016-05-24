package by.gal.handmade.service.data;

import by.gal.handmade.api.service.IRepository;

public class RepositoryFactory {
	
	private static IRepository repository;

	public static IRepository getRepository(){
		if( repository == null){
			repository = new Repository();
		}
		return repository;
	}
}
