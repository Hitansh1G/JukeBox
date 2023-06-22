package com.sample.codingame.commands;

import java.util.List;

import com.sample.codingame.entities.ScoreOrder;
import com.sample.codingame.entities.User;
import com.sample.codingame.services.IUserService;

public class LeaderBoardCommand implements ICommand{

    private final IUserService userService;
    
    public LeaderBoardCommand(IUserService userService) {
        this.userService = userService;
    }

    // TODO: CRIO_TASK_MODULE_CONTROLLER
    // Execute getAllUserScoreOrderWise method of IUserService and print the result.
    // Look for the unit tests to see the expected output.
    // Sample Input Token List:- ["LEADERBOARD","ASC"]
    // or
    // ["LEADERBOARD","DESC"]

    @Override
    public void execute(List<String> tokens) {
        try{
            ScoreOrder order = ScoreOrder.valueOf(tokens.get(1));
            List<User>ulist = userService.getAllUserScoreOrderWise(order);
            System.out.println(ulist);
        }catch(Exception e){
            System.out.println((e.getMessage()));
        }
    }
    
}
