package com.sample.codingame.repositories;

import java.util.List;

import com.sample.codingame.entities.Level;
import com.sample.codingame.entities.Question;

public interface IQuestionRepository extends CRUDRepository<Question,String> {
    public List<Question> findAllQuestionLevelWise(Level level);
}
