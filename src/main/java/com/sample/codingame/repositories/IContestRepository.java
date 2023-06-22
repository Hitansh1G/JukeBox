package com.sample.codingame.repositories;

import java.util.List;

import com.sample.codingame.entities.Contest;
import com.sample.codingame.entities.Level;

public interface IContestRepository extends CRUDRepository<Contest,String> {
    public List<Contest> findAllContestLevelWise(Level level);
}
