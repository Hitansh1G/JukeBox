package com.sample.jukebox.services;

import com.sample.jukebox.repositories.IUserRepository;
import com.sample.jukebox.entities.PlayList;
import com.sample.jukebox.entities.User;

import java.util.List;

public class UserService implements IuserService {

    IUserRepository iUserRepository;


    public UserService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }


    @Override
    public User create(String name) {
        return iUserRepository.save(new User(null,name));
    }

    @Override
    public List<PlayList> getAllPlayList(String userId) {
        return null;
    }
}