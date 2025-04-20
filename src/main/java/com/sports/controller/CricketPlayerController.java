package com.sports.controller;


import com.sports.entity.CricketPlayer;
import com.sports.service.CricketPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CricketPlayers")
public class CricketPlayerController {
    @Autowired
    private CricketPlayerService cricketPlayerService;

    @PostMapping(value = "/addPlayer")
    public String addCricketPlayer(@RequestBody CricketPlayer cricketPlayer) {
        cricketPlayerService.save(cricketPlayer);
        return "Player added successfully"+cricketPlayer.getPlayerName();
    }

    @GetMapping(value = "getPlayer/{playerId}")
    public String getCricketPlayer(@PathVariable int playerId) {
        CricketPlayer player = cricketPlayerService.findById(playerId).get();
        return "Player found: " + player.getPlayerName();
    }


    @GetMapping(value = "getAllPlayers")
    public String getAllCricketPlayers() {
        CricketPlayer player=cricketPlayerService.findAll().iterator().next();
        return "All players found:"+getAllCricketPlayers();
    }

    @DeleteMapping(value = "deletePlayer")
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
