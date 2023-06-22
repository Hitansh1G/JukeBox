package com.sample.jukebox.repositories;

import com.sample.jukebox.entities.Album;

public interface IAlbumRepository extends CRUDRepository<Album,String> {
    public Album findAlbumById(String albumId);

    public  Album findAlbumByAlbumName(String albumName);

}