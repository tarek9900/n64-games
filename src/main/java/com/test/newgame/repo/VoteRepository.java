package com.test.newgame.repo;

import com.test.newgame.model.Vote;
import org.springframework.data.repository.CrudRepository;


public interface VoteRepository extends CrudRepository<Vote, Integer> {


}
