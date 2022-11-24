package com.example.assignment2;

public class APIResponse {

    private Game[] games;

    public APIResponse(Game[] games) {
        this.games = games;
    }

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }
}
