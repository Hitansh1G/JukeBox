package com.sample.jukebox.repositories;

import com.sample.jukebox.entities.PlayList;
import com.sample.jukebox.entities.Song;
import com.sample.jukebox.entities.UserPlayList;

import java.util.List;

public interface IUserPlayListRepository extends CRUDRepository<UserPlayList,String>{
    public List<PlayList> findAllPlayListByUserId(String userId);
    public void delelePlayListByUserIdAndPlayListId(String userId,String playListId);

    public PlayList createPlayList(PlayList entity);

    public boolean isPlayListExistByPlayListId(String userId,String playListId);

    public PlayList addListOfSongsToUserPlayList(String userId, String playListId, List<Song> songs);

    public PlayList removeListOfSongsFromUserPlayList(String userId, String playListId, List<Song> songs);
}