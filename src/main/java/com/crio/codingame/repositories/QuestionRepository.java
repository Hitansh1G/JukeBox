package com.crio.codingame.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.crio.codingame.entities.Level;
import com.crio.codingame.entities.Question;

public class QuestionRepository implements IQuestionRepository {

    private final Map<String,Question> questionMap;
    private Integer autoIncrement = 0;

    public QuestionRepository(){
        questionMap = new HashMap<String,Question>();
    }

    public QuestionRepository(Map<String, Question> questionMap) {
        this.questionMap = questionMap;
        this.autoIncrement = questionMap.size();
    }

    @Override
    public Question save(Question entity) {
        if( entity.getId() == null ){
            autoIncrement++;
            Question q = new Question(Integer.toString(autoIncrement),entity.getTitle(),entity.getLevel(),entity.getScore());
            questionMap.put(q.getId(),q);
            return q;
        }
        questionMap.put(entity.getId(),entity);
        return entity;
    }

    // TODO: CRIO_TASK_MODULE_SERVICES
    // Find all the list of Question Present in the Repository
    // Tip:- Use Java Streams

    @Override
    public List<Question> findAll() {
    //  return Collections.emptyList();
        List<Question>questionsList = new ArrayList<Question>();
        for(Question question : questionMap.values()){
            questionsList.add(question);
        }
        return questionsList;
    }

    @Override
    public Optional<Question> findById(String id) {
        return Optional.ofNullable(questionMap.get(id));
    }

    @Override
    public boolean existsById(String id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void delete(Question entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteById(String id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    // TODO: CRIO_TASK_MODULE_SERVICES
    // Find all the list of Question Present in the Repository provided Level
    // Tip:- Use Java Streams

    @Override
    public List<Question> findAllQuestionLevelWise(Level level) {

    
        List<Question>levelWiseQuestionList = new ArrayList<Question>();
        // for(Map.Entry<String,Question> entry : questionMap.entrySet()){
        //     Question temp = entry.getValue();
        //     Level lev = temp.getLevel();
        //     if(lev.equals(level)){
        //         levelWiseQuestionList.put(entry.getKey());
        //     }

        // }
        for(Question question : questionMap.values()){
            if(question.getLevel().equals(level)){
                levelWiseQuestionList.add(question);
            }
        }
         return levelWiseQuestionList;
    }
    
}
