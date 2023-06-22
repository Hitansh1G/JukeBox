package com.sample.jukebox.repositories;

import java.util.List;

import com.sample.jukebox.entities.PlayList;
import com.sample.jukebox.entities.User;

public interface IUserRepository extends CRUDRepository<User,String>{
    public List<PlayList> findAllPlayList(String name);
}