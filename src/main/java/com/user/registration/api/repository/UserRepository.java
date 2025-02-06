package com.user.registration.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.registration.api.model.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>{

}
