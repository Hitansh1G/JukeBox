package com.sample.jukebox.repositories;

import com.sample.jukebox.entities.Song;

public interface ISongRepository extends CRUDRepository<Song,String>{
    public Song findSongById(String songId);
}