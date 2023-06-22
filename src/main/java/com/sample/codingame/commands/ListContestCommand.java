package com.sample.codingame.commands;

import java.util.List;

import com.sample.codingame.entities.Contest;
import com.sample.codingame.entities.Level;
import com.sample.codingame.services.IContestService;

public class ListContestCommand implements ICommand{

    private final IContestService contestService;
    
    public ListContestCommand(IContestService contestService) {
        this.contestService = contestService;
    }

    // TODO: CRIO_TASK_MODULE_CONTROLLER
    // Execute getAllContestLevelWise method of IContestService and print the result.
    // Look for the unit tests to see the expected output.
    // Sample Input Token List:- ["LIST_CONTEST","HIGH"]
    // or
    // ["LIST_CONTEST"]

    @Override
    public void execute(List<String> tokens) {
        try{
            if(tokens.size()==1){
                List<Contest>listOfContests = contestService.getAllContestLevelWise(null);
                System.out.println(listOfContests);
                return;
            }
            Level contestLevel = Level.valueOf(tokens.get(1));
            List<Contest>listOfContest = contestService.getAllContestLevelWise(contestLevel);
            System.out.println(listOfContest);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
