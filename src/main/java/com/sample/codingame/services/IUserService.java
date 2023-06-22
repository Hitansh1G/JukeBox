package com.sample.codingame.services;

import java.util.List;

import com.sample.codingame.dtos.UserRegistrationDto;
import com.sample.codingame.entities.ScoreOrder;
import com.sample.codingame.entities.User;
import com.sample.codingame.exceptions.ContestNotFoundException;
import com.sample.codingame.exceptions.InvalidOperationException;
import com.sample.codingame.exceptions.UserNotFoundException;

public interface IUserService {
    public User create(String name);
    public List<User> getAllUserScoreOrderWise(ScoreOrder scoreOrder);
    public UserRegistrationDto attendContest(String contestId, String userName) throws ContestNotFoundException, UserNotFoundException, InvalidOperationException;
    public UserRegistrationDto withdrawContest(String contestId, String userName) throws ContestNotFoundException, UserNotFoundException, InvalidOperationException;
}
