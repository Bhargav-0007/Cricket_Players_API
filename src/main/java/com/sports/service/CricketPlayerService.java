package com.sports.service;

import com.sports.entity.CricketPlayer;
import com.sports.entity.TotalMatches;
import com.sports.repo.CricketPlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CricketPlayerService {
    @Autowired
    CricketPlayerRepo cricketPlayerRepo;

    //create record
    public void save(CricketPlayer cricketPlayer) {
        cricketPlayerRepo.save(cricketPlayer);
    }

    //retrieve one record
    public Optional<CricketPlayer> findById(int playerId) {
        return cricketPlayerRepo.findById(playerId);
    }

    //retrieve all records
    public Iterable<CricketPlayer> findAll() {
        return cricketPlayerRepo.findAll();
    }

    //delete a record
    public void deleteById(int playerId) {
        cricketPlayerRepo.deleteById(playerId);
    }

    //delete all records
    public void deleteAll() {
        cricketPlayerRepo.deleteAll();
    }

}
