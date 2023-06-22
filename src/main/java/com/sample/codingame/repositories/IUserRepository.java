package com.sample.codingame.repositories;

import java.util.Optional;

import com.sample.codingame.entities.User;

public interface IUserRepository extends CRUDRepository<User,String> {
    public Optional<User> findByName(String name); 
}
