package com.sample.jukebox.commands;

import com.sample.jukebox.dtos.UserPlayedSongDto;
import com.sample.jukebox.exceptions.PlayListNotFoundException;
import com.sample.jukebox.exceptions.UserNotFoundException;
import com.sample.jukebox.services.IUserPlayListService;

import java.util.List;

public class PlayPlayListCommand implements  ICommand{
    private final IUserPlayListService userPlayListService;

    public PlayPlayListCommand(IUserPlayListService userPlayListService) {
        this.userPlayListService = userPlayListService;
    }
    @Override
    public void execute(List<String> tokens) {
        try{
            UserPlayedSongDto playedSongDto = userPlayListService.setCurrentPlayList(tokens.get(1),tokens.get(2));
            System.out.println(playedSongDto);
        }catch (UserNotFoundException e){
            System.out.println("User Not Found");
        }catch (PlayListNotFoundException e){
            System.out.println("Playlist is empty");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}