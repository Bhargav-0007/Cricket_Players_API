package com.sports.controller;
import com.sports.entity.CricketPlayer;
import com.sports.service.CricketPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Cricket")
public class CricketPlayerController {
    @Autowired
    private CricketPlayerService cricketPlayerService;

    @PostMapping(value = "/addPlayer")
    public String addCricketPlayer(@RequestBody CricketPlayer cricketPlayer) {
        cricketPlayerService.save(cricketPlayer);
        return "Player added successfully: " + cricketPlayer.getPlayerName();
    }

    @GetMapping(value = "getPlayer/{playerId}")
    public Optional<CricketPlayer> getCricketPlayer(@PathVariable int playerId) {
        return cricketPlayerService.findById(playerId);
    }


    @GetMapping(value = "getAllPlayers")
    public Iterable<CricketPlayer> getAllCricketPlayers() {
        return cricketPlayerService.findAll();
    }

    @DeleteMapping(value = "deletePlayer/{playerId}")
    public String deleteCricketPlayer(@PathVariable int playerId) {
        cricketPlayerService.deleteById(playerId);
        return "Player deleted successfully"+playerId;
    }

    @DeleteMapping(value = "deleteAllPlayers")
    public String deleteAllCricketPlayers() {
        cricketPlayerService.deleteAll();
        return "All players deleted";
    }
}
