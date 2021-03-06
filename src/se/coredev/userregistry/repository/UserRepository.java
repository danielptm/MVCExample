package se.coredev.userregistry.repository;

import se.coredev.userregistry.model.User;

public interface UserRepository {

	User get(String id) throws RepositoryException;
	
	void add(User user) throws RepositoryException;
	
}
