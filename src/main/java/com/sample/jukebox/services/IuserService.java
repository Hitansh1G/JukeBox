package com.sample.jukebox.services;

import java.util.List;
import com.sample.jukebox.entities.PlayList;
import com.sample.jukebox.entities.User;

public interface IuserService {
    public User create(String name);
    public List<PlayList> getAllPlayList(String userId);
    
}