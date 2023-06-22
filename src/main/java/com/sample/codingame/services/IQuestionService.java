package com.sample.codingame.services;

import java.util.List;

import com.sample.codingame.entities.Level;
import com.sample.codingame.entities.Question;

public interface IQuestionService {
    public Question create(String title, Level level, Integer difficultyScore);
    public List<Question> getAllQuestionLevelWise(Level level);
}
