package com.hg.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hg.crud.models.UserDTO;

@Repository
public interface IUserDAO extends MongoRepository<UserDTO, String> {
	
	
}
