package com.sample.codingame.services;

import java.util.List;

import com.sample.codingame.dtos.ContestSummaryDto;
import com.sample.codingame.entities.Contest;
import com.sample.codingame.entities.Level;
import com.sample.codingame.exceptions.ContestNotFoundException;
import com.sample.codingame.exceptions.InvalidContestException;
import com.sample.codingame.exceptions.QuestionNotFoundException;
import com.sample.codingame.exceptions.UserNotFoundException;

public interface IContestService {
    public Contest create(String contestName, Level level, String contestCreator, Integer numQuestion) throws UserNotFoundException, QuestionNotFoundException;
    public List<Contest> getAllContestLevelWise(Level level);
    public ContestSummaryDto runContest(String contestId, String contestCreator) throws ContestNotFoundException, InvalidContestException;
}
