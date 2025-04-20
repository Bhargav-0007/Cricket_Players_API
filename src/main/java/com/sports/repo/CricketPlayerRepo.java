package com.sports.repo;

import com.sports.entity.CricketPlayer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CricketPlayerRepo extends CrudRepository<CricketPlayer, Integer> {

}
