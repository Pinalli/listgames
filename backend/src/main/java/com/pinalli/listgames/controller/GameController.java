package com.pinalli.listgames.controller;

import com.pinalli.listgames.dto.GameDTO;
import com.pinalli.listgames.dto.GameMinDto;
import com.pinalli.listgames.services.GameService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameMinDto> findAllGames() {
        List<GameMinDto> result;
        result = gameService.findAllGames();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }
}
