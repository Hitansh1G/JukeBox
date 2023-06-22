package com.sample.jukebox.services;

import java.util.List;
import com.sample.jukebox.dtos.UserPlayedSongDto;
import com.sample.jukebox.entities.PlayList;
import com.sample.jukebox.entities.SongPlayingOrder;
import com.sample.jukebox.exceptions.InvalidOperationException;
import com.sample.jukebox.exceptions.PlayListNotFoundException;
import com.sample.jukebox.exceptions.SongNotFoundException;
import com.sample.jukebox.exceptions.UserNotFoundException;

public interface IUserPlayListService {
    public UserPlayedSongDto playSongById(String userId,String songId) throws UserNotFoundException,SongNotFoundException;
    public UserPlayedSongDto playSongByOrder(String userId,SongPlayingOrder playingOrder) throws UserNotFoundException;
    public PlayList createPlayList(String userId,String PlayListName,List<String>songs) throws UserNotFoundException,SongNotFoundException;
    public void deletePlayList(String userId,String PlayListId) throws UserNotFoundException,PlayListNotFoundException;
    public PlayList addSongToPlayList(String userId, String playListId, List<String>songs) throws UserNotFoundException,PlayListNotFoundException,SongNotFoundException, InvalidOperationException;
    public PlayList deleteSongFromPlayList(String userId,String playListId,List<String>songs) throws UserNotFoundException,PlayListNotFoundException,SongNotFoundException, InvalidOperationException;

    public UserPlayedSongDto setCurrentPlayList(String userId,String playListId) throws UserNotFoundException,PlayListNotFoundException;

}